package pages;

import locators.Locator;
import org.openqa.selenium.support.How;

import static common.BuiltInAction.click;

public class productsPage {

    private Locator createButton = new Locator(How.XPATH, "//button[@class='btn btn-primary o-kanban-button-new']");

    public void goToCreateNewProduct(){
        click(createButton.getBy());
    }
}
