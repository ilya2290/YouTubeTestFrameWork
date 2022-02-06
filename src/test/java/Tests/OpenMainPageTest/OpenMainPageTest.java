package Tests.OpenMainPageTest;

import SeleniumProperties.SeleniumProperties;
import org.testng.annotations.Test;

public class OpenMainPageTest extends SeleniumProperties {

    @Test
    public void openMainPageTest() throws InterruptedException {
        Thread.sleep(5000);
        youtubeMainValue.pagesContainer.mainPage.checkMainLogo();

    }
}
