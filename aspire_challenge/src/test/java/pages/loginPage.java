package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.How;
import locators.Locator;
import static common.BuiltInAction.*;


public class loginPage {
    private Locator usernameField = new Locator(How.CSS, "#login");
    private Locator passwordField = new Locator(How.CSS, "#password");
    private Locator loginButton = new Locator(How.CSS, ".btn");
    private Locator errorMessage = new Locator(How.CSS, ".alert");

    @Step("Login Action")
    public void login(String username, String password) {
        enter(usernameField.getBy(), username);
        enter(passwordField.getBy(), password);
        click(loginButton.getBy());
    }
}
