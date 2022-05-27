package com.choucairtesting.demo.opencart.stepdefinitions;

import com.choucairtesting.demo.opencart.steps.crudSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class crudStepDefinitions {


    @Steps
    com.choucairtesting.demo.opencart.steps.crudSteps crudSteps;
    loginStepDefinitions loginStepDefinitions;
    @Given("^I log in to openCart \"([^\"]*)\" \"([^\"]*)\"$")
    public void iLogInToOpenCart(String user, String pass) {
        loginStepDefinitions.iAmOnTheOpenCartLoginPage();
        loginStepDefinitions.iEnterTheCorrectCredentials(user,pass);
    }

    @When("^added a new categories \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void addedANewCategories(String categoryName, String description, String metaTagTitle, String metaTagDescription, String metaTagKeywords) {

        crudSteps.clickCatalog();
        crudSteps.clickCategories();
        crudSteps.clickAddnew();
        crudSteps.writeCategoryname(categoryName);
        crudSteps.writeDescription(description);
        //scroll down
        crudSteps.writeMetaTagTitle(metaTagTitle);
        crudSteps.writeMetaTagDescription(metaTagDescription);
        crudSteps.writeMetaTagKeywords(metaTagKeywords);
        //scroll up
        crudSteps.clickSave();

    }

    @Then("^on the screen i can see the categorie added$")
    public void onTheScreenICanSeeTheCategorieAdded() {
        crudSteps.validationSaveSuccessfull();

    }

    @When("^added a new categories with nothing \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void addedANewCategoriesWithNothing(String categoryName, String description, String metaTagTitle, String metaTagDescription, String metaTagKeywords) {
        crudSteps.clickCatalog();
        crudSteps.clickCategories();
        crudSteps.clickAddnew();
        crudSteps.writeCategoryname(categoryName);
        crudSteps.writeDescription(description);
        //scroll down
        crudSteps.writeMetaTagTitle(metaTagTitle);
        crudSteps.writeMetaTagDescription(metaTagDescription);
        crudSteps.writeMetaTagKeywords(metaTagKeywords);
        //scroll up
        crudSteps.clickSave();
    }

    @Then("^on the screen i can see the error messege$")
    public void onTheScreenICanSeeTheErrorMessege() {
crudSteps.validationSaveError();
    }

    @When("^select the first item of the list$")
    public void selectTheFirstItemOfTheList() {
        crudSteps.clickCatalog();
        crudSteps.clickCategories();
        crudSteps.clickCheckBox();
    }

    @When("^click on the pencil of modify$")
    public void clickOnThePencilOfModify() {
crudSteps.clickModify();
    }

    @When("^modify the attributes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void modifyTheAttributesAnd(String categoryName, String metaTagTitle) {
        crudSteps.writeCategoryname(categoryName);
        //scroll down
        crudSteps.writeMetaTagTitle(metaTagTitle);
        //scroll up
        crudSteps.clickSave();
    }

    @Then("^on the screen i can see the categorie modify$")
    public void onTheScreenICanSeeTheCategorieModify() {
crudSteps.validationModifySuccessfull();
    }

    @When("^select the any item of the list$")
    public void selectTheAnyItemOfTheList() {
        crudSteps.clickCatalog();
        crudSteps.clickCategories();
        crudSteps.clickCheckBox();

    }

    @When("^click in the delete button$")
    public void clickInTheDeleteButton() {
    crudSteps.clickDelete();
    }

    @When("^click confirmate the alert$")
    public void clickConfirmateTheAlert()   {
    crudSteps.confirmiteAlert();
    }

    @Then("^on the screen i can´t see the categorie select$")
    public void onTheScreenICanTSeeTheCategorieSelect() {
crudSteps.validationDeleteSuccessfull();
    }

    @Given("^I log in to openCart \"([^\"]*)\" \"([^\"]*)\" When select the any item of the list$")
    public void iLogInToOpenCartWhenSelectTheAnyItemOfTheList(String categoryName, String arg2) {
        crudSteps.clickCatalog();
        crudSteps.clickCategories();
        crudSteps.clickCheckBox();
    }





    @Then("^on the screen i cant see the erro mssg$")
    public void onTheScreenICantSeeTheErroMssg() {
crudSteps.validationDeleteError();

    }

}
