package com.choucairtesting.demo.opencart.stepdefinitions;

import com.choucairtesting.demo.opencart.models.loginModels;
import com.choucairtesting.demo.opencart.steps.loginSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class loginStepDefinitions {

    @Steps
    com.choucairtesting.demo.opencart.steps.loginSteps loginSteps;

    @Given("^i am on the OpenCart login page$")
    public void iAmOnTheOpenCartLoginPage() {
        loginSteps.openPage();

    }


    @When("^i enter the correct credentials \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterTheCorrectCredentials(String user, String pass) {
        loginSteps.writeUser(user);
        loginSteps.writePass(pass);
        loginSteps.clickLogin();
    }

    @Then("^on the screen I can see a welcome message$")
    public void onTheScreenICanSeeAWelcomeMessage() {
     loginSteps.verifyLogin();
    }

    @When("^i enter the wrong credentials$")
    public void iEnterTheWrongCredentials(List<loginModels> credential ) {

        loginSteps.writeUser(credential.get(0).getUser());
        loginSteps.writePass(credential.get(0).getPass());
        loginSteps.clickLogin();

    }

    @Then("^on the screen I can see an error message$")
    public void onTheScreenICanSeeAnErrorMessage() {
        loginSteps.verifyError();

    }
}
