package pages;

import common.Utilities;
import io.qameta.allure.Step;
import locators.Locator;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.Map;

import static common.BuiltInAction.*;
import static java.lang.Thread.sleep;

public class productsNewPage {

    private Locator productNameField = new Locator(How.CSS, "[name='name']");
    private Locator productTypeSelect = new Locator(How.CSS, "[name='type']");
    private Locator productCategorySelect= new Locator(How.CSS, "[name='categ_id'] .o_input");
    private Locator internalReferenceField = new Locator(How.CSS, "[name='default_code']");
    private Locator barcodeField = new Locator(How.CSS, "[name='barcode']");
    private Locator salesPriceField = new Locator(How.CSS, "[name='list_price'] > [placeholder]");
    private Locator costField = new Locator(How.CSS, "[name='standard_price'] > [placeholder]");
    private Locator unitOfMeasureField = new Locator(How.CSS, "[name='uom_id'] .o_input");
    private Locator purchaseUnitOfMeasureField = new Locator(How.CSS, "[name='uom_po_id'] .o_input");
    private Locator internalNotesField = new Locator(How.CSS, "[name='default_code']");
    private Locator saveButton = new Locator(How.XPATH, "//button[@class='btn btn-primary o_form_button_save']");
    private Locator discardButton = new Locator(How.CSS, ".o_form_button_cancel");

    private String manufactoringDataPath = Utilities.getProjectPath() + "\\src\\test\\java\\data\\manufactoringData.json";

    @DataProvider(name = "manufactoringData")
    public Iterator<Object[]> shortFinormCSVReader() throws Exception{
        return dataParse(this.manufactoringDataPath);
    }

    @Step("Add New Product Action")
    public void addNewProduct(Map<String, String> manufactoringData) throws InterruptedException {
        String productName = manufactoringData.get("productName");
        String productType = manufactoringData.get("productType");
        String productCategory = manufactoringData.get("productCategory");
        String internalReference = manufactoringData.get("internalReference");
        String barcode = manufactoringData.get("barcode");
        String salesPrice = manufactoringData.get("salesPrice");
        String cost = manufactoringData.get("cost");
        String unitOfMeasure = manufactoringData.get("unitOfMeasure");
        String purchaseUnitOfMeasure = manufactoringData.get("purchaseUnitOfMeasure");
        String internalNotes = manufactoringData.get("internalNotes");

        enter(productNameField.getBy(), productName);
        select(productTypeSelect.getBy(), "text", productType);
        enter(productCategorySelect.getBy(),productCategory);
        enter(internalNotesField.getBy(), internalNotes);
        enter(barcodeField.getBy(), barcode);
        enter(salesPriceField.getBy(), salesPrice);
        enter(costField.getBy(), cost);
        enter(unitOfMeasureField.getBy(),unitOfMeasure);
        enter(purchaseUnitOfMeasureField.getBy(),purchaseUnitOfMeasure);
        enter(internalNotesField.getBy(), internalNotes);
        click(saveButton.getBy());

    }




}
