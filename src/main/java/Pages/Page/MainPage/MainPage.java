package Pages.Page.MainPage;

import Pages.Page_Core.Page_Core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page_Core {

    public MainPage(WebDriver driver) {
        super(driver);
    }


    //Придумать как вынести в csv таблицу, чтобы были в отдельном файле
    private final By youTubeMainLogo = By.xpath("//yt-icon[@id ='logo-icon' and (@class='style-scope ytd-logo')]"); //difference with up
    private final By youTubeMainSearchField = By.xpath("//ytd-searchbox[@id='search']");
    private final By youTubeVirtualKeyboard_Icon = By.xpath("//a[@class='gsst_a']");
    private final By YouTubeVirtualKeyboard_Expanded = By.xpath("//div[@class='vk-box']");
    private final By videoFromList = null;


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
