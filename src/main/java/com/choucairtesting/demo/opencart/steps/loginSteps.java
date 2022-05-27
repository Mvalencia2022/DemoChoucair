package com.choucairtesting.demo.opencart.steps;

import com.choucairtesting.demo.opencart.pageobjects.loginPageObjects;

import net.thucydides.core.annotations.Step;

public class loginSteps {


loginPageObjects loginPageObjects =new loginPageObjects();

    @Step
    public void openPage()
    {
        loginPageObjects.open();
    }

    @Step
    public void writeUser(String user)
    {
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtUsername()).sendKeys(user);
    }

    @Step
    public void writePass(String pass)
    {
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtPassword()).sendKeys(pass);
    }

    @Step
    public void clickLogin()
    {
        loginPageObjects.getDriver().findElement(loginPageObjects.getLgnLogin()).click();

    }

    @Step
    public void verifyLogin()
    {

            loginPageObjects.getDriver().findElement(loginPageObjects.getMssExit()).isEnabled();
    }


    @Step
    public void verifyError()

    {
        loginPageObjects.getDriver().findElement(loginPageObjects.getMssExit()).isDisplayed();
    }

}
