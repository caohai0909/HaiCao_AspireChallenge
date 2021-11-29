package models;

import locators.Locator;
import org.openqa.selenium.support.How;

public class manufactoring_models {

    private String productNameField;
    private String productTypeSelect;
    private String productCategorySelect;
    private String internalReferenceField;
    private String barcodeField;
    private String salesPriceField;
    private String costField;
    private String unitOfMeasureField;
    private String purchaseUnitOfMeasureField;
    private String internalNotesField;

    public manufactoring_models(String productNameField, String productTypeSelect, String productCategorySelect, String internalReferenceField, String barcodeField, String salesPriceField, String costField, String UnitOfMeasureField, String purchaseUnitOfMeasureField, String internalNotesField) {

    }

    public String getProductNameField(){
        return this.productNameField;
    }

    public void setProductNameField(String productNameField){
        this.productNameField = productNameField;
    }

    public String getProductTypeSelect(){
        return this.productTypeSelect;
    }

    public void setProductTypeSelect(String productTypeSelect){
        this.productTypeSelect = productTypeSelect;
    }

    public String getProductCategorySelect(){
        return this.productCategorySelect;
    }

    public void setProductCategorySelect(String productCategorySelect){
        this.productCategorySelect = productCategorySelect;
    }

    public String getInternalReferenceField(){
        return this.internalReferenceField;
    }

    public void  setInternalReferenceField(String internalReferenceField){
        this.internalReferenceField= internalReferenceField;
    }

    public String getBarcodeField(){
        return this.barcodeField;
    }

    public void setBarcodeField(String barcodeField){
        this.barcodeField = barcodeField;
    }

    public String getSalesPriceField(){
        return this.salesPriceField;
    }

    public void setSalesPriceField(String salesPriceField){
        this.salesPriceField=salesPriceField;
    }

    public String getCostField(){
        return this.costField;
    }

    public void setCostField(String costField){
        this.costField=costField;
    }

    public String getUnitOfMeasureField(){
        return this.unitOfMeasureField;
    }

    public void setUnitOfMeasureField(String unitOfMeasureField){
        this.unitOfMeasureField=unitOfMeasureField;
    }

    public String getPurchaseUnitOfMeasureField(){
        return this.purchaseUnitOfMeasureField;
    }

    public void setPurchaseUnitOfMeasureField(String purchaseUnitOfMeasureField){
        this.purchaseUnitOfMeasureField = purchaseUnitOfMeasureField;
    }

    public String getInternalNotesField(){
        return this.internalNotesField;
    }

    public void setInternalNotesField(String internalNotesField){
        this.internalNotesField=internalNotesField;
    }
}
