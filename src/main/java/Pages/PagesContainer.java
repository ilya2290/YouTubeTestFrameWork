package Pages;

import Pages.MainPage.MainPage;
import org.openqa.selenium.WebDriver;

public class PagesContainer {
   public PagesContainer(WebDriver driver, String chosenFilm){
      this.driver = driver;
      this.chosenFilm = chosenFilm;
   }
   private WebDriver driver;
   private String chosenFilm;
   public MainPage mainPage = new MainPage(driver, chosenFilm);


}
