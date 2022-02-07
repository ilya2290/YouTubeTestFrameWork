package SeleniumProperties;

import Pages.PagesContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class SeleniumProperties {

    protected static SeleniumProperties youtubeMainValue = null;


    static {
        System.setProperty("webdriver.chrome.driver", "D:\\IntelliJ IDEA Community Edition 2020.2.1\\Chrome Driver\\chromedriver.exe");
    }


    public WebDriver driver = new ChromeDriver();
    private String chosenFilm;
    //public SeleniumProperties seleniumProperties = new SeleniumProperties();
    public PagesContainer pagesContainer = new PagesContainer(driver, chosenFilm);
    public Assertion assertion = new Assertion();


    private final String mainPage_URL = "https://www.youtube.com/";

    @BeforeTest
    public void beforeTestSetup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); // Узнать какой есть новый метод
        driver.get(mainPage_URL);
    }

    @AfterTest
    public void afterTestSetup() {
        //    driver.quit();
    }
}
