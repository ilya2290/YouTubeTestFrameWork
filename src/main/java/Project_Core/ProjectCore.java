package Project_Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ProjectCore {


    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\olena.poliakova\\automation\\Projects\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080));
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); //knowing new method
        return driver;
    }

}
