package com.choucairtesting.demo.opencart.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=Wuxf1iSyAEyyZcABfDJnRP4ZGCAriBEj")
public class loginPageObjects extends PageObject {
    By txtUsername =By.xpath("//*[@id=\"input-username\"]");
    By txtPassword =By.xpath("//*[@id=\"input-password\"]");
    By lgnLogin =By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button");
    By mssExit= By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a");


    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getLgnLogin() {
        return lgnLogin;
    }

    public By getMssExit() {
        return mssExit;
    }
}
