package Tests.TEST_RunNewVideosMusicPlaylist;

import Pages.Page_Core.Page_Core;
import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class TEST_RunNewVideosMusicPlaylist extends Test_Core {

    @Test(priority = 5)
    public void runPlaylist() throws InterruptedException {
        page_core.openPage("https://www.youtube.com/");
        mainPage.runPlaylist();
        Thread.sleep(5000);
    }
}
