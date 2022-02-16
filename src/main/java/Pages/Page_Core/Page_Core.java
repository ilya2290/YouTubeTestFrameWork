package Pages.Page_Core;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Page_Core {

    protected WebDriver driver;


    public Page_Core(WebDriver driver) {
        this.driver = driver;
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


    public static String getXpath(String xpathName) {
        String xpath = null;
        String stringAfterSearching = null;
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\illia.sukhina\\IdeaProjects\\YouTubeTestFrameWork\\src\\main\\java\\Pages\\Locators.csv"))) { //Поменять путь к файлу сделать ифы, чтобы находить путь или сделать пользователя
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
                xpath = stringAfterSearching.replace(xpathName + ",", "");
            } else System.out.println("Xpath is not found");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(xpath);
        return xpath;
    }

    public  WebElement locator(String string) {
     return  driver.findElement(By.xpath(getXpath(string)));
    }
}
