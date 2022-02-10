package Tests.TEST_CheckVirtualKeyboardAppearance;

import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class TEST_CheckVirtualKeyboardAppearance extends Test_Core {

    @Test(priority = 2)
    public void CheckVirtualKeyboardAppearance() {
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkVirtualKeyboardPresence();
    }
}
