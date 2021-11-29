package tests;
import common.TestBase;
import org.testng.annotations.Test;
import pages.*;
import java.util.Map;
import static common.Constant.SALESFORCE_NAME;
import static common.Constant.SALESFORCE_PASSWORD;


public class manufactoring_tests extends TestBase {

    @Test(description = "Testcase 01: Verify that user can create manufacturing successfully", dataProvider = "manufactoringData", dataProviderClass = productsNewPage.class)
    public void TC_01_VerifyThatUserCanCreateManufacturingSuccessfully(Map<String,String> manufactoringData) throws InterruptedException {

        loginPage LoginPage = new loginPage();
        homePage HomePage = new homePage();
        inventoryPage InventoryPage = new inventoryPage();
        productsPage ProductsPage = new productsPage();
        productsNewPage ProductsNewPage = new productsNewPage();
        manufactoringPage ManufactoringPage = new manufactoringPage();
        manufactoringNewPage ManufactoringNewPage = new manufactoringNewPage();

        //Step 1. Login to web application
        LoginPage.login(SALESFORCE_NAME, SALESFORCE_PASSWORD);
        //VP:
        HomePage.checkHomePageExsisted();

        //Step 2. Navigate to `Inventory` feature
        HomePage.goToInventory();

        //Step 3. From the top-menu bar, select `Products -> Products` item, then create a new product
        InventoryPage.goToProductTo("products");
        ProductsPage.goToCreateNewProduct();
        ProductsNewPage.addNewProduct(manufactoringData);

        //Step 4. From top-left page, click on `Application` icon
        InventoryPage.goToApplication();

        //Step 5. Navigate to `Manufacturing` feature, then create a new Manufacturing Order item for the created Product on step #3
        //Step 6.Update the status of new Orders to “Done”
        HomePage.goToManufacturing();
        ManufactoringPage.goToCreateNewManufactoring();
        ManufactoringNewPage.addNewManufactoring(manufactoringData);

    }

}
