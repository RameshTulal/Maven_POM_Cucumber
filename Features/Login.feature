Feature: Catalog Login

  Background: Catalog Background
    Given Launch URL "https://example.testproject.io/web/" in Chrome browser
   
   

  @Execute1
  Scenario: Validate login with valid credentials
    Then Validate login page displayed
    And User enter email as "admin@yourstore.com" and password as "12345"
    And Click on Login
    Then Validate login success for the user "admin@yourstore.com"
    When User click Logout link
    Then Validate user logout success
    And Close browser

  @Execute1
  Scenario Outline: Validate login for multiple user with valid credentials
    Given Validate login page displayed
    Then User enter email as "<Email>" and password as "<Password>"
    And Click on Login
    Then Validate login success for the user "<Email>"
    When User click Logout link
    Then Validate user logout success
    And Close browser

    Examples:
    |Email                   |Password    |
    |admin@yourstore.com     | 12345      |
    |admin@yourstore.com     | 12345      |

  @Execute
  Scenario: Validate login with invalid credentials
    Given Validate login page displayed
    And User enter email as "admin@yourstore.com" and password as "test"
    And Click on Login
    Then Validate login failure happened
    And Close browser

