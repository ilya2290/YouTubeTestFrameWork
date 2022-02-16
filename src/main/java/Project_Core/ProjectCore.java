package Project_Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ProjectCore {


    public static WebDriver createDriver() {
        //System.setProperty("webdriver.chrome.driver", "D:\\IntelliJ IDEA Community Edition 2020.2.1\\Chrome Driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe"); // Путь с ноута(удалить)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); //knowing new method
        return driver;
    }

}
