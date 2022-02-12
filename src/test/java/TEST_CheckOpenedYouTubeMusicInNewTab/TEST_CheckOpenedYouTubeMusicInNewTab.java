package TEST_CheckOpenedYouTubeMusicInNewTab;

import Project_Core.ProjectCore;
import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class TEST_CheckOpenedYouTubeMusicInNewTab extends Test_Core {
    @Test(priority = 4)
    public void cpenYouTubeMusicPage(){
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkYouTubeMusicPageIsOpenedInNewTab();
    }
}
