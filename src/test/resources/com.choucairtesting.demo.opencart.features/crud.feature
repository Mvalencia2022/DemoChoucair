@tag
Feature: CRUD

  @addedSuccessfull
  Scenario:Crud
    Given I log in to openCart "demo" "demo"
    When added a new categories "Category Name1" "Description" "Meta Tag Title" "Meta Tag Description" "Meta Tag Keywords"
    Then on the screen i can see the categorie added


  @addedError
  Scenario:Crud
    Given I log in to openCart "demo" "demo"
    When added a new categories with nothing " " "" "" "" ""
    Then on the screen i can see the error messege


  @modifySuccessfull
  Scenario:Crud
    Given I log in to openCart "demo" "demo"
    When select the first item of the list
    And click on the pencil of modify
    And modify the attributes "Categorie Name Modify" and "Meta taga tittle Modify"
    Then on the screen i can see the categorie modify


  @modifyError
  Scenario:Crud
    Given I log in to openCart "demo" "demo"
    When added a new categories with nothing " " "" "" "" ""
    Then on the screen i can see the categorie added


  @deleteSuccessfull
  Scenario:Crud
    Given I log in to openCart "demo" "demo"
    When select the any item of the list
    And click in the delete button
    And click confirmate the alert
    Then on the screen i can´t see the categorie select

  @deleteError
  Scenario:Crud
    Given I log in to openCart "demo" "demo" When select the any item of the list
    And click in the delete button
    And click confirmate the alert
    Then on the screen i cant see the erro mssg