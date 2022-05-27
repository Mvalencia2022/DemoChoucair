@tag
Feature: Login

  Background:
    Given i am on the OpenCart login page

  @LoginSuccessful
  Scenario:Login Successful
    When i enter the correct credentials "demo" "demo"
    Then on the screen I can see a welcome message

  @LoginError
  Scenario Outline:Login Successful
    When i enter the wrong credentials
      | user   | password   |
      | <user> | <password> |
    Then on the screen I can see an error message

    Examples:
      | user  | password |
      | Admin | error    |
      | Admin |          |
      | error | admin123 |
      |       | admin123 |
      | error | error    |
      |       |          |