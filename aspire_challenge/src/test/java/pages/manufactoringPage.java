package pages;

import locators.Locator;
import org.openqa.selenium.support.How;

import static common.BuiltInAction.click;

public class manufactoringPage {
    private Locator createManufactoringButton = new Locator(How.XPATH, "//button[@class='btn btn-primary o_list_button_add']");

    public void goToCreateNewManufactoring(){
        click(createManufactoringButton.getBy());
    }
}
