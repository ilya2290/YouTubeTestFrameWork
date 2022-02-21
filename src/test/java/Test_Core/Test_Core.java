package Test_Core;

import Pages.Page.MainPage.MainPage;
import Pages.Page_Core.Page_Core;
import Project_Core.ProjectCore;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Test_Core {


    protected WebDriver driver = ProjectCore.createDriver();
    public Page_Core page_core = new Page_Core(driver);
    public MainPage mainPage = new MainPage(driver);


    @BeforeTest
    public void beforeTestSetup() {
        driver.manage().window().maximize();
    }

   @AfterTest(alwaysRun = true)
   public void afterTestSetup() {
     driver.quit();
   }
//Добавить отчистку локал стореджа и кукис
}
