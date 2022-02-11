package Tests.TEST_OpenMainPage;

import Test_Core.Test_Core;
import org.testng.annotations.Test;

public class OpenMainPageTest extends Test_Core {
//Приоритет работает в том случае, если несколько тестов в 1 классе. Как задать приоритет для тестов из разных классов - вопрос.
    @Test(priority = 1)
    public void checkMainLogoTest() {
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkMainLogo();
    }

    @Test(priority = 2)
    public void CheckVirtualKeyboardAppearance() {
        page_core.openPage("https://www.youtube.com/");
        mainPage.checkVirtualKeyboardPresence();
    }
}
///