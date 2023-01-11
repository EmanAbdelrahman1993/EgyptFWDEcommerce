@smoke
Feature: F07_followUs | users could open followUs links
  Background:
    Given user go to home page

  Scenario: user opens facebook link
    When user opens facebook link
    And   user moves to new tab
    Then  "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user opens twitter link
  When user opens twitter link
  And   user moves to new tab
  Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user opens rss link
  When user opens rss link
  And   user moves to new tab
  Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens youtube link
  When user opens youtube link
  And   user moves to new tab
  Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
