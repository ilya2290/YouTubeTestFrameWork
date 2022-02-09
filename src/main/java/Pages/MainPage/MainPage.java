package Pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    private String win;
    private String chosenFilm;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public void chosenFilm(String chosenFilm){this.chosenFilm = chosenFilm;}
    public String getChosenFilm(){return chosenFilm;}
    public void setChosenFilm(String chosenFilm){this.chosenFilm = chosenFilm;}

    public void win(String win){this.win = win;}
    public String getWin(){return win;}
    public void setWin(String win){this.win = win;}

    // By youtubeMainLogo = By.ByXPath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]");
    By youtubeMain = By.xpath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]"); //difference with up
    By youtubeMainSearchField = By.xpath("//yt-icon[@id='search-icon' and (@class='style-scope ytd-searchbox')]");
    By youtubeVideoFromList = By.xpath("//*[@id='video-title-link' and (@href='/watch?v=gTP55I3kSB0')]");
    By youtubeVirtualKeyboard = By.xpath("//a[@class='gsst_a']");





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
        if(driver.findElement(youtubeMainSearchField).isDisplayed()){
            System.out.println("Youtube search field is displayed");
        }
        else
            System.out.println("Youtube search field is missed");
    }

    public void searchAndOpenVideo(){
    driver.findElement(youtubeVideoFromList).click();
    /*
    if(driver){

        System.out.println("The video is opened");
    }
    else
        System.out.println("Something was wrong");
    */
    }

    public void clearSearchField(){

    }

    public void openVirtualKeyboard(){driver.findElement(youtubeVirtualKeyboard).click();
        if(driver.findElement(youtubeVirtualKeyboard).isDisplayed()){
            System.out.println("Virtual keyboard is opened");
        }
        else
            System.out.println("Virtual keyboard is missed");
    }
}
