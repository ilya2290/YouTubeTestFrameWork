package Tests.TEST_CheckVoiceSearchFunction;

import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class TEST_CheckVoiceSearchFunction extends Test_Core {

    @Test()
    public void checkVoiceSearchFunction(){
        page_core.openPage("https://www.youtube.com/");
        mainPage.clickMicrophoneButton();
    }
}