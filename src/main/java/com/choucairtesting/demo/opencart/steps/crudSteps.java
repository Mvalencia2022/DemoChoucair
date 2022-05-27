package com.choucairtesting.demo.opencart.steps;

import com.choucairtesting.demo.opencart.pageobjects.crudPageObjects;
import net.thucydides.core.annotations.Step;

public class crudSteps {

    crudPageObjects crudPageObject= new crudPageObjects();



    @Step
    public void openPage()
    {
        crudPageObject.open();
    }

    @Step
    public void clickCatalog()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnCatalog()).click();
    }

    @Step
    public void clickCategories()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnCategories()).click();
    }

    @Step
    public void clickAddnew()

    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnAddCategories()).click();
    }

    @Step
    public void writeCategoryname(String categoryName)
    {
        crudPageObject.getDriver().findElement(crudPageObject.getTxtCategoryName()).sendKeys(categoryName);
    }

    @Step
    public void writeDescription(String description){
        crudPageObject.getDriver().findElement(crudPageObject.getTxtDescription()).sendKeys(description);;}
    @Step
    public void writeMetaTagTitle(String metaTagTitle){
        crudPageObject.getDriver().findElement(crudPageObject.getTxtMetaTagTitle()).sendKeys(metaTagTitle);}
    @Step
    public void writeMetaTagDescription(String metaTagDescription){
        crudPageObject.getDriver().findElement(crudPageObject.getTxtMetaTagDescription()).sendKeys(metaTagDescription);}
    @Step
    public void writeMetaTagKeywords(String metaTagKeywords){
        crudPageObject.getDriver().findElement(crudPageObject.getTxtMetaTagKeyword()).sendKeys(metaTagKeywords);}
    @Step
    public void clickSave()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnSave()).click();
    }

    @Step
    public void validationSaveSuccessfull()
    {
        /* Ya lo pensaremos despues */
    }
    @Step
    public void clickCheckBox()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnChecbox()).click();
    }
    @Step
    public  void clickDelete()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnDelete()).click();
    }

    @Step
    public void confirmiteAlert()
    {
        crudPageObject.getDriver().switchTo().alert().accept();
    }
    @Step
    public void validationDeleteSuccessfull()
    {
        /* Ya lo pensaremos despues */
    }
    @Step
    public void validationDeleteError()
    {
        /* Ya lo pensaremos despues */
    }
    @Step
    public void clickModify()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnEdit()).click();
    }

    @Step
    public void validationModifySuccessfull()
    {
        /* Ya lo pensaremos despues */
    }
    @Step
    public void clickCancel()
    {
        crudPageObject.getDriver().findElement(crudPageObject.getBtnCancel()).click();
    }

    @Step
    public void validationModifyError()
    {
        /* Ya lo pensaremos despues */
    }
    @Step
    public void validationSaveError() {
        /* Ya lo pensaremos despues */
    }
}
