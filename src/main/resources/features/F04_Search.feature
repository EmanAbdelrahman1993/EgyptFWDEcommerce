@smoke
Feature: F04_Search | user search for products
  Scenario Outline:  Logged user will be able to search using product name
    Given user logged in
    And   user located in home page
    When  user enter product name as "<name>"
    And   user press enter
    Then  search results contain "<name>" should be displayed
    Examples:
      |  name  |
      |  book  |
      | laptop |
      |  nike  |


  Scenario Outline: Scenario Outline:  Logged user will be able to search for product using sku
    Given user logged in
    And   user located in home page
    When  user enter product sku as "<sku>"
    And   user press enter
    Then  search result contain "<sku>" should be displayed
    Examples:
      |     sku     |
      |  SCI_FAITH  |
      |  APPLE_CAM  |
      |  SF_PRO_11  |