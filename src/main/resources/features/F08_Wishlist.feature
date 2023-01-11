@smoke
Feature: F08_Wishlist | Wishlist

  Background:
    Given user logged in
    And   user go to home page
    When  user click add to wishlist button

  Scenario: Logged user could add different products to Wishlist[1]
    Then  product should be added to wishlist

  Scenario: Logged user could add different products to Wishlist[2]
    And   user wait until success message disappears
    And   user clicks wishlist tab
    Then  product quantity in wishlist should be > 0