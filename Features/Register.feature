Feature: Catalog Register

  Background: Catalog Background
    Given Launch URL "https://example.testproject.io/web/" in Chrome browser
   

  @Execute
  Scenario: Validate Register
    Given Validate login page displayed
    And User enter email as "admin@yourstore.com" and password as "12345"
    And Click on Login
    Then Validate login success for the user "admin@yourstore.com"
    And User select country as "India"
    And User enter address as "testAddress"
    And User enter email address as "testEmail@test.com"
    And User enter contact as "123456789"
    When User click Save button
    Then Validate data saved
    When User click Logout link
    Then Validate user logout success
    And Close browser

