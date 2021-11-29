package pages;

import common.TestBase;
import io.qameta.allure.Step;
import locators.Locator;
import org.openqa.selenium.support.How;
import static common.BuiltInAction.*;
public class homePage{

    private Locator discussButton = new Locator(How.CSS, "[data-menu-xmlid='mail.menu_root_discuss'] > .o_app_icon");
    private Locator inventoryButton = new Locator(How.CSS, "[data-menu-xmlid='stock.menu_stock_root'] > .o_app_icon");
    private Locator manufacturingButton = new Locator(How.CSS, "[data-menu-xmlid='mrp.menu_mrp_root'] > .o_app_icon");
    private Locator barcodeButton = new Locator(How.CSS, "[data-menu-xmlid='stock_barcode.stock_barcode_menu'] > .o_app_icon");
    private Locator homePageTitle = new Locator(How.XPATH, "//title[.='Odoo']");

    @Step("Go to Discuss")
    public void goToDiscuss(){
        click(discussButton.getBy());
    }

    @Step("Go to Inventory")
    public void goToInventory(){
        click(inventoryButton.getBy());
    }

    @Step("Go to Manufacturing")
    public void goToManufacturing(){
        click(manufacturingButton.getBy());
    }

    @Step("Go to Barcode")
    public void goToBarcode(){
        click(barcodeButton.getBy());
    }

    @Step("Check Home Page exited")
    public void checkHomePageExsisted(){
        checkControlExistz(homePageTitle.getBy());
    }


}
