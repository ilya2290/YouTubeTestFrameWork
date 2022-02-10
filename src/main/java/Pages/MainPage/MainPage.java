package Pages.MainPage;

import SeleniumProperties.SeleniumProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    // By youtubeMainLogo = By.ByXPath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]");
    By youtubeMain = By.xpath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]"); // Разница с верхним?


    public void checkMainLogo() {
        if(driver.findElement(youtubeMain).isDisplayed()){
            System.out.println("YouTube main logo is displayed");
        }
        else
            System.out.println("YouTube main logo ");
    }

    public void checkYouTubeRegion(){

    }

    public void checkSearchFieldExisting(){

    }

    public void searchVideo(){

    }

    public void clearSearchField(){

    }
}
