@smoke
Feature: F08_Wishlist | Wishlist

  Background:
    Given user logged in
    And   user go to home page
    When  user clicks add to wishlist button at the selected product

  Scenario: Logged user can add products to Wishlist
    Then  product added to wishlist

  Scenario: Logged user can add products to Wishlist
    And   wait until this success message with green color to disappears
    And   user click on "Wishlist" Tab on the top of the page
    Then  verify product quantity in wishlist greater than 0