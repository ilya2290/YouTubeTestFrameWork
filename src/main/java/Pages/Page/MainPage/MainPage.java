package Pages.Page.MainPage;

import Pages.Page_Core.Page_Core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Page_Core {

    public MainPage(WebDriver driver) {
        super(driver);
    }


    //Придумать как вынести в csv таблицу, чтобы были в отдельном файле
    private final By youTubeMainLogo = By.xpath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]"); //difference with up
    private final By youTubeMainSearchField = By.xpath("//ytd-searchbox[@id='search']");
    private final By youTubeVirtualKeyboard_Icon = By.xpath("//a[@class='gsst_a']");
    private final By YouTubeVirtualKeyboard_Expanded = By.xpath("//div[@class='vk-box']");
    private final By YouTubeVoiceSearchButton = By.xpath("//div[@id ='voice-search-button']");
    private final By YouTubeAppsMultiPageButton = By.cssSelector("ytd-app");//Can`t find locator for element. Please help me
    private final By YouTubeMicrophoneButtonPopup = By.xpath("//div[@id='microphone']");
    private final By YouTubeVoiceSearchDialogPopup = By.xpath("//ytd-voice-search-dialog-renderer[@dialog='true']");
    private final By YouTubeAppsMultiPageMenu = By.xpath("//div[@id='container' and (@class='menu-container style-scope ytd-multi-page-menu-renderer')]");
    private final By YouTubeMusicButton = By.xpath("//a[@href='https://music.youtube.com/']");
    private final By YouTubeMusicPageLogo = By.xpath("//a[@class='yt-simple-endpoint style-scope ytmusic-nav-bar']");
    private final By videoFromList = null;

    public void checkAppsMultiPageButton(){
        waitVisibilityOfElement(driver.findElement(YouTubeAppsMultiPageButton));
        if(driver.findElement(YouTubeAppsMultiPageButton).isDisplayed()){
            System.out.println("\n" + "Check Successfull: Apps multipage button is visible");
        } else
            System.out.println("\n" + "Error! Apps multipage button is missed");
    }
    public void clickAppsMultipageButton(){
        checkAppsMultiPageButton();
        driver.findElement(YouTubeAppsMultiPageButton).click();
    }
    public void checkAppsMultiPageMenu(){
        clickAppsMultipageButton();
        waitVisibilityOfElement(driver.findElement(YouTubeAppsMultiPageMenu));
        if(driver.findElement(YouTubeAppsMultiPageMenu).isDisplayed()){
            System.out.println("\n" + "Check Successfull: Apps multipage menu is visible");
        } else
            System.out.println("\n" + "Error! YouTube apps multipage menu is missed");
    }
    public void clickYouTubeMusicButton(){
        checkAppsMultiPageMenu();
        driver.findElement(YouTubeMusicButton).click();
    }
    public void checkYouTubeMusicPageIsOpenedInNewTab(){
        clickYouTubeMusicButton();
        waitVisibilityOfElement(driver.findElement(YouTubeMusicButton));
            if(driver.findElement(YouTubeMusicPageLogo).isDisplayed()){
                System.out.println("\n" + "Check Successfull: YouTube Music page is opened in new tab");
            } else
                System.out.println("\n" + "Error! YouTube Music page is not opened");
        }




    public void checkVoiceSearchButton(){
        waitVisibilityOfElement(driver.findElement(YouTubeVoiceSearchButton));
        if (driver.findElement(YouTubeVoiceSearchButton).isDisplayed()){
            System.out.println("\n" + "Check Successfull: YouTube voice search button is visible");
        } else
            System.out.println("\n" + "Error! YouTube voice search button is missed");
    }

    public void clickVoiceSearchButton(){
        checkVoiceSearchButton();
        driver.findElement(YouTubeVoiceSearchButton).click();
    }

    public void checkVoiceSearchDialogPopupIsVisible(){
        clickVoiceSearchButton();
        waitAppearanceInDOM(YouTubeMicrophoneButtonPopup);
        if(driver.findElement(YouTubeMicrophoneButtonPopup).isDisplayed()){
            driver.findElement(YouTubeMicrophoneButtonPopup).click();
            waitVisibilityOfElement(driver.findElement(YouTubeVoiceSearchDialogPopup));
        }if(driver.findElement(YouTubeVoiceSearchDialogPopup).isDisplayed()){
           System.out.println("Check Successfull: Dialog popup is visible");
        } else
            System.out.println("Error! Dialog popup is missed");
    }

    public void clickMicrophoneButton(){
        checkVoiceSearchDialogPopupIsVisible();
        driver.findElement(YouTubeMicrophoneButtonPopup).click();
    }




    public void checkMainLogo() {
        waitVisibilityOfElement(driver.findElement(youTubeMainLogo));
        if (driver.findElement(youTubeMainLogo).isDisplayed()) {
            System.out.println("\n" + "Check Successful: YouTube main Logo is displayed");
        } else
            System.out.println("\n" + "Error! YouTube main Logo is missed");
    }


    public void checkYouTubeRegion() {

    }


    public void checkSearchFieldExisting() {
        waitVisibilityOfElement(driver.findElement(youTubeMainSearchField));
        if (driver.findElement(youTubeMainSearchField).isDisplayed()) {
            System.out.println("\n" + "Check Successful: Youtube search field is displayed");
        } else
            System.out.println("\n" + "Error! Youtube search field is missed");
    }

    public void clickOnSearchField(){
        checkSearchFieldExisting();
        driver.findElement(youTubeMainSearchField).click();
    }


    public void searchAndOpenVideo() {
        driver.findElement(null).click();
    }


    public void checkVirtualKeyboardPresence() {  //Почему не работает, если не видно иконки, наверно нужно добавить исключение.
        clickOnSearchField();
        waitAppearanceInDOM(youTubeVirtualKeyboard_Icon);
        if (driver.findElement(youTubeVirtualKeyboard_Icon).isDisplayed()) {
            (driver.findElement(youTubeVirtualKeyboard_Icon)).click();
            waitVisibilityOfElement(driver.findElement(YouTubeVirtualKeyboard_Expanded));
            if (driver.findElement(YouTubeVirtualKeyboard_Expanded).isDisplayed()) {
                System.out.println("\n" + "Check Successful: Youtube Virtual Keyboard is present.");
            } else {
                System.out.println("\n"+"Error! Youtube Virtual Keyboard is not present.");
            }
        } else
            System.out.println("\n"+"Error! Youtube Virtual Keyboard icon is not present");
    }
}
