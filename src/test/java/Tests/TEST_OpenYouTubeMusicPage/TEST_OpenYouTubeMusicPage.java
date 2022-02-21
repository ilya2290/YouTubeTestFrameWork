package Tests.TEST_OpenYouTubeMusicPage;

import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class TEST_OpenYouTubeMusicPage extends Test_Core {

    @Test()
    public void openYouTubeMusicPage() {
        driver.manage().deleteAllCookies();
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkYouTubeMusicPageIsOpenedInNewTab();
    }
}
