package pages;

import io.qameta.allure.Step;
import locators.Locator;
import org.openqa.selenium.support.How;

import static common.BuiltInAction.*;

public class inventoryPage {

    //Top-menu bar
    private Locator overviewLi = new Locator(How.CSS, ".o_menu_entry_lvl_1 > span");
    private Locator operationsLi = new Locator(How.CSS, "[data-menu-xmlid='stock.menu_stock_warehouse_mgmt']");
    private Locator productsLi = new Locator(How.CSS, "[data-menu-xmlid='stock.menu_stock_inventory_control']");
    private Locator reportingLi = new Locator(How.CSS, "[data-menu-xmlid='stock.menu_warehouse_report']");
    private Locator configurationLi = new Locator(How.CSS, "[data-menu-xmlid='stock.menu_stock_config_settings']");
    private Locator applicationIcon = new Locator(How.CSS, ".o_menu_toggle");
    //Products dropdown list
    private Locator productsSpan =  new Locator(How.CSS, "[data-menu='117'] > span");
    private Locator lots_SerialNumberSpan= new Locator(How.CSS, "[data-menu='121'] > span");
    private Locator packagesSpan = new Locator(How.CSS, "[data-menu='127'] > span");


    @Step("Go to Discuss")
    public void goToProductTo(String target){
        String realTarget = target + "Span";
        try {
            if (realTarget.equalsIgnoreCase("productsSpan")) {

                click(productsLi.getBy());
                click(productsSpan.getBy());
            }
            else if (realTarget.equalsIgnoreCase("lots_SerialNumberSpan")) {
                click(productsLi.getBy());
                click(lots_SerialNumberSpan.getBy());
            }
            else if (realTarget.equalsIgnoreCase("packagesSpan")) {
                click(productsLi.getBy());
                click(packagesSpan.getBy());
            }
        }catch (Exception err) {
            System.out.println("Error: Can Not find target \n" + err);
        }

    }

    @Step("Go to Applocation")
    public void goToApplication(){
        click(applicationIcon.getBy());
    }



}
