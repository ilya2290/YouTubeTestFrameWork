package Tests.TEST_CheckVoiceSearchFunction;

import Test_Core.Test_Core;
import org.testng.annotations.Test;
import static Pages.Page_Core.Page_Core.getXpath;


public class TEST_CheckVoiceSearchFunction extends Test_Core {

    @Test(priority = 3)
    public void checkVoiceSearchFunction(){
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkAgreeBeforeYouContinueToYouTubeCookies(); //Добавил, тк на ноуте просило принять куки.
        mainPage.clickMicrophoneButton();
    }

    /*
    @Test
    public void testLocator()  {
        getXpath("youTubeMainLogo");
        System.out.println(mainPage.locator("youTubeMainLogo"));
    }
*/
}
