package Pages.Page_Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public By waitAppearanceInDOM(By locator){
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator));  //Подумать нужен ли войд
        return locator;
    }

    /**
     * @param element;
     * @param locator;
     * This method is using to wait element first in DOM, then wait elements presence in WEB;
     * @return WebElement;
     */
    public WebElement waitDOMAppearanceAndVisibility(WebElement element, By locator) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(locator));
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
