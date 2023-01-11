@smoke
Feature: F03_currencies | User Check Currency sign

  Scenario: User could change the currency
    Given user go to home page
    When  select Euro currency from the dropdown list
    Then  Euro sign is shown on the 4 products that are displayed in Home page
