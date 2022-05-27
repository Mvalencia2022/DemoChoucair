package com.choucairtesting.demo.opencart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com.choucairtesting.demo.opencart.features\\crud.feature",
        glue="com.choucairtesting.demo.opencart.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class crudRunner {
}
