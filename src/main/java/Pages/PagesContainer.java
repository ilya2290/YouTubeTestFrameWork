package Pages;

import Pages.MainPage.MainPage;
import SeleniumProperties.SeleniumProperties;
import org.openqa.selenium.WebDriver;

public class PagesContainer {
   public PagesContainer(WebDriver driver){
      this.driver = driver;
   }
   private WebDriver driver;
   public MainPage mainPage = new MainPage(driver);


}
