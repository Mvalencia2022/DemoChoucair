package com.choucairtesting.demo.opencart.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class crudPageObjects  extends PageObject {


    By btnCatalog= By.xpath("//*[@id=\"menu-catalog\"]/a");
    By btnCategories= By.xpath("//*[@id=\"collapse1\"]/li[1]/a");
    By btnAddCategories= By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[1]");
    By txtCategoryName= By.xpath("//*[@id=\"input-name1\"]");
    By txtDescription= By.xpath("//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]");
    By txtMetaTagTitle= By.xpath("//*[@id=\"input-meta-title1\"]");
    By txtMetaTagDescription= By.xpath("//*[@id=\"input-meta-description1\"]");
    By txtMetaTagKeyword= By.xpath("//*[@id=\"input-meta-keyword1\"]");
    By btnSave= By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
    By mssError= By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
    By btnEdit= By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[4]/a");
    By btnCancel = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a");
    By btnChecbox = By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[1]/input");
    By btnDelete =By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");


    public By getBtnCatalog() {
        return btnCatalog;
    }

    public By getBtnCategories() {
        return btnCategories;
    }

    public By getBtnAddCategories() {
        return btnAddCategories;
    }

    public By getTxtCategoryName() {
        return txtCategoryName;
    }

    public By getTxtDescription() {
        return txtDescription;
    }

    public By getTxtMetaTagTitle() {
        return txtMetaTagTitle;
    }

    public By getTxtMetaTagDescription() {
        return txtMetaTagDescription;
    }

    public By getTxtMetaTagKeyword() {
        return txtMetaTagKeyword;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public By getMssError() {
        return mssError;
    }

    public By getBtnEdit() {
        return btnEdit;
    }

    public By getBtnCancel() {
        return btnCancel;
    }

    public By getBtnChecbox() {
        return btnChecbox;
    }

    public By getBtnDelete() {
        return btnDelete;
    }
}
