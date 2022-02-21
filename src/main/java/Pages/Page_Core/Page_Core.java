package Pages.Page_Core;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Page_Core {

    protected static WebDriver driver;


    public Page_Core(WebDriver driver) {
        Page_Core.driver = driver;
    }

    public void openPage(String URL) {
        driver.get(URL);
    }


    public WebElement waitVisibilityOfElement(WebElement element) {  //Наверно сделать метод, которые принимает тайм юнит, чтобы сделать произвольное ожидание по элт
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));// - посмотреть по локатору, чтобы проверить предварительно наличие в доме presenceOfElementLocated()
        return element; //Подумать нужен ли войд
    }


    public By waitAppearanceInDOM(By locator) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator));  //Подумать нужен ли войд
        return locator;
    }


    /**
     * @param element;
     * @param locator; This method is using to wait element first in DOM, then wait elements presence in WEB;
     * @return WebElement;
     */
    public WebElement waitDOMAppearanceAndVisibility(WebElement element, By locator) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(locator));
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
        return element;
    }


    /**
     *
     * @param xpathName - name of element from CSV file.
     * @return xpathFinal - xpath of current element
     */
    public static String getXpath(String xpathName) {
        String xpathBeforeCut;
        String xpathFinal = null;
        String stringAfterSearching = null;
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\ilya\\IdeaProjects\\YouTubeTestFrameWork\\src\\main\\java\\Pages\\Locators.csv"))) { //Поменять путь к файлу сделать ифы, чтобы находить путь или сделать пользователя
            List<String[]> allLocators = csvReader.readAll();
            List<String> mapLocatorsArrayList = new ArrayList<>();
            for (String[] allLocator : allLocators) {
                mapLocatorsArrayList.add(Arrays.toString(allLocator));
            }
            for (String string : mapLocatorsArrayList) {
                if (string.contains(xpathName)) {
                    stringAfterSearching = string;
                }
            }
            if (stringAfterSearching != null) {
                xpathBeforeCut = stringAfterSearching.replace(xpathName + ",", "");
                xpathFinal = xpathBeforeCut.substring(1, xpathBeforeCut.length() - 1).trim();
            } else System.out.println("Xpath is not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xpathFinal;
    }


    /**
     *
     * @param nameOfLocatorInCSV - name of locator in CSV file
     * @return Web Element
     */
    public static WebElement locator(String nameOfLocatorInCSV) {
        return  driver.findElement(By.xpath(getXpath(nameOfLocatorInCSV)));
    }


    /**
     *
     * @param message - explanatory message, what compares to what.
     * @param actual - actual result
     * @param expected -expected result
     */
    public static void checkAssertion(String message, Object actual, Object expected) {
        Assert.assertEquals(actual, expected, message);
        System.out.println("| " + message + ": " + " Actual result: " + actual + " " + " Expected result: " + expected + "");
    }

}
