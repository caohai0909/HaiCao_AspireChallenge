package common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static common.BuiltInAction.maximizeWindow;
import static common.BuiltInAction.navigateTo;
import static common.Constant.AUT_URL;
import static locators.WebDriver.openBrowser;
import static common.BuiltInAction.quit;

public class TestBase {

    @BeforeMethod
    public void Startup() {
        openBrowser("Chrome");
        navigateTo(AUT_URL);
        maximizeWindow();
    }

//    @AfterMethod
//    public void ClearUp() {
//        quit();
//    }
}
