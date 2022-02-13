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
    private final By youTubeVirtualKeyboard_Expanded = By.xpath("//div[@class='vk-box']");
    private final By youTubeVoiceSearchButton = By.xpath("//div[@id ='voice-search-button']");
    private final By youTubeAppsMultiPageButton = By.cssSelector("style-scope ytd-topbar-menu-button-renderer");
    private final By youTubeMicrophoneButtonPopup = By.xpath("//div[@id='microphone']");
    private final By youTubeVoiceSearchDialogPopup = By.xpath("//ytd-voice-search-dialog-renderer[@dialog='true']");
    private final By youTubeAppsMultiPageMenu = By.xpath("//div[@id='container' and (@class='menu-container style-scope ytd-multi-page-menu-renderer')]");
    private final By youTubeMusicButton = By.xpath("//a[@href='https://music.youtube.com/']");
    private final By youTubeMusicPageLogo = By.xpath("//a[@class='yt-simple-endpoint style-scope ytmusic-nav-bar']");
    private final By youTubeMusicWindow = By.linkText("https://music.youtube.com/");
    private final By youTubeExploreMenuButton = By.xpath("//*[@id='items']");
    private final By youTubeExplorePageMusicSectionButton = By.xpath("//a[@href='/channel/UC-9-kyTW8ZkZNDHQJ6FgpwQ' and (@id='destination-content-root')]");
    private final By youTubeNewMusicVideosPlaylist = By.xpath("//a[@href='/playlist?list=PLnc6mq_nY21NBsHwysCHoVhb7TcaxF4CE']");
    private final By youTubePlaylistRunButton = By.xpath("//div[@id='contents']/child::ytd-playlist-video-renderer[1]");

    private final By videoFromList = null;

    public void checkExploreMenuButton(){
        waitVisibilityOfElement(driver.findElement(youTubeExploreMenuButton));
        if(driver.findElement(youTubeExploreMenuButton).isDisplayed()){
            System.out.println("\n" + "Check Successfull: Explore menu button is visible");
        } else
            System.out.println("\n" + "Error! Explore button is missed");
    }

    public void clickExploreMenuButton(){
        checkExploreMenuButton();
        driver.findElement(youTubeExploreMenuButton).click();
    }

    public void checkExplorePageMusicSectionButton(){
        clickExploreMenuButton();
        waitVisibilityOfElement(driver.findElement(youTubeExplorePageMusicSectionButton));
        if(driver.findElement(youTubeExplorePageMusicSectionButton).isDisplayed()){
            System.out.println("\n" + "Check Successfull: Explore page is opened and Music section button is visible");
        }else
            System.out.println("\n" + "Error! Something was wrong");
    }

    public void clickExploreMusicSectionButton(){
        checkExplorePageMusicSectionButton();
        driver.findElement(youTubeExplorePageMusicSectionButton).click();
    }

    public void checkNewMusicVideosPlaylistSection(){
        clickExploreMusicSectionButton();
        waitVisibilityOfElement(driver.findElement(youTubeNewMusicVideosPlaylist));
        if(driver.findElement(youTubeNewMusicVideosPlaylist).isDisplayed()){
            System.out.println("\n" + "Check Successfull: New music video playlist is visible");
        }else
            System.out.println("\n" + "Error! New music video playlist is missed");
    }

    public void openNewMusicVideoPlaylist(){
        checkNewMusicVideosPlaylistSection();
        driver.findElement(youTubeNewMusicVideosPlaylist).click();
    }

    public void checkOpenedNewMusicVideoPlaylist(){
        openNewMusicVideoPlaylist();
        waitVisibilityOfElement(driver.findElement(youTubePlaylistRunButton));
        if(driver.findElement(youTubePlaylistRunButton).isDisplayed()){
            System.out.println("Chech Successfull: Playlist is visible");
        } else
            System.out.println("Error! We lost them");
    }

    public void runPlaylist(){
        checkOpenedNewMusicVideoPlaylist();
        driver.findElement(youTubePlaylistRunButton).click();
    }


    public void checkAppsMultiPageButton() {
        waitVisibilityOfElement(driver.findElement(youTubeAppsMultiPageButton));
        if (driver.findElement(youTubeAppsMultiPageButton).isDisplayed()) {
            System.out.println("\n" + "Check Successfull: Apps multipage button is visible");
        } else
            System.out.println("\n" + "Error! Apps multipage button is missed");
    }


    public void clickAppsMultipageButton() {
        checkAppsMultiPageButton();
        driver.findElement(youTubeAppsMultiPageButton).click();
    }


    public void checkAppsMultiPageMenu() {
        clickAppsMultipageButton();
        waitVisibilityOfElement(driver.findElement(youTubeAppsMultiPageMenu));
        if (driver.findElement(youTubeAppsMultiPageMenu).isDisplayed()) {
            System.out.println("\n" + "Check Successfull: Apps multipage menu is visible");
        } else
            System.out.println("\n" + "Error! YouTube apps multipage menu is missed");
    }


    public void clickYouTubeMusicButton() {
        checkAppsMultiPageMenu();
        driver.findElement(youTubeMusicButton).click();
    }


    public void checkYouTubeMusicPageIsOpenedInNewTab() {
        clickYouTubeMusicButton();
        waitVisibilityOfElement(driver.findElement(youTubeMusicWindow));
        if (driver.findElement(youTubeMusicWindow).isDisplayed()) {
            System.out.println("\n" + "Check Successfull: YouTube Music page is opened in new tab");
        } else
            System.out.println("\n" + "Error! YouTube Music page is not opened");
    }

    public void checkYouTubeMusicLogo(){
        checkYouTubeMusicPageIsOpenedInNewTab();
        waitVisibilityOfElement(driver.findElement(youTubeMusicPageLogo));
        if(driver.findElement(youTubeMusicPageLogo).isDisplayed()){
            System.out.println("\n" + "Check Successfull: YouTube Music logo is visible");
        } else
            System.out.println("\n" + "Error! YouTube Music logi is missed");
    }


    public void checkVoiceSearchButton() {
        waitVisibilityOfElement(driver.findElement(youTubeVoiceSearchButton));
        if (driver.findElement(youTubeVoiceSearchButton).isDisplayed()) {
            System.out.println("\n" + "Check Successfull: YouTube voice search button is visible");
        } else
            System.out.println("\n" + "Error! YouTube voice search button is missed");
    }

    public void clickVoiceSearchButton() {
        checkVoiceSearchButton();
        driver.findElement(youTubeVoiceSearchButton).click();
    }

    public void checkVoiceSearchDialogPopupIsVisible() {
        clickVoiceSearchButton();
        waitAppearanceInDOM(youTubeMicrophoneButtonPopup);
        if (driver.findElement(youTubeMicrophoneButtonPopup).isDisplayed()) {
            driver.findElement(youTubeMicrophoneButtonPopup).click();
            waitVisibilityOfElement(driver.findElement(youTubeVoiceSearchDialogPopup));
        }
        if (driver.findElement(youTubeVoiceSearchDialogPopup).isDisplayed()) {
            System.out.println("Check Successfull: Dialog popup is visible");
        } else
            System.out.println("Error! Dialog popup is missed");
    }

    public void clickMicrophoneButton() {
        checkVoiceSearchDialogPopupIsVisible();
        driver.findElement(youTubeMicrophoneButtonPopup).click();
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

    public void clickOnSearchField() {
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
            waitVisibilityOfElement(driver.findElement(youTubeVirtualKeyboard_Expanded));
            if (driver.findElement(youTubeVirtualKeyboard_Expanded).isDisplayed()) {
                System.out.println("\n" + "Check Successful: Youtube Virtual Keyboard is present.");
            } else {
                System.out.println("\n" + "Error! Youtube Virtual Keyboard is not present.");
            }
        } else
            System.out.println("\n" + "Error! Youtube Virtual Keyboard icon is not present");
    }
}
