package pages;

import common.Utilities;
import io.qameta.allure.Step;
import locators.Locator;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.Map;

import static common.BuiltInAction.*;

public class manufactoringNewPage {

    private Locator producField = new Locator(How.CSS, "[name='product_id'] .o_input");
    private Locator quantity1Field = new Locator(How.CSS, ".text-left[name='product_qty']");
    private Locator quantity2Field = new Locator(How.CSS, "[name='product_uom_id'] .o_input");
    private Locator addALineButton = new Locator(How.XPATH, "//div[@name='move_raw_ids']//a[.='Add a line']");
    private Locator saveButton = new Locator(How.XPATH, "//button[@class='btn btn-primary o_form_button_save']");
    private Locator searchProductField= new Locator(How.XPATH, "//tr[@class='o_data_row o_selected_row']//div[@name='product_id']//input[@class='o_input ui-autocomplete-input']");
    private Locator confirmButton = new Locator(How.XPATH, "//span[.='Confirm']");
    private Locator toComsumeField = new Locator(How.XPATH, "//input[@name='product_uom_qty']");
    private Locator markAsDoneButton = new Locator(How.XPATH, "//span[.='Mark as Done']");
    String prductAfterSearch = "//a[.='%s']";

    @Step("Add New Manufactoring Action")
    public void addNewManufactoring(Map<String, String> manufactoringData) throws InterruptedException {
        String product = manufactoringData.get("productName");
        String internalNote = manufactoringData.get("internalNotes");
        String quantity1 = manufactoringData.get("quatity1");
        String quantity2 = manufactoringData.get("quatity2");
        String toConsume = manufactoringData.get("toConsume");
        String realProductName = "[" + internalNote + "] " + product;

        String productAfterSearchLocator = prductAfterSearch.replace("%s", realProductName);
        Locator realProductAfterSearchLocator = new Locator(How.XPATH, productAfterSearchLocator);

        enter(producField.getBy(), realProductName);
        click(realProductAfterSearchLocator.getBy());
        enter(quantity1Field.getBy(), quantity1);
        enter(quantity2Field.getBy(), quantity2);
        click(addALineButton.getBy());
        enter(searchProductField.getBy(), product);
        enter(toComsumeField.getBy(), toConsume);
        click(confirmButton.getBy());
        click(markAsDoneButton.getBy());
    }
}
