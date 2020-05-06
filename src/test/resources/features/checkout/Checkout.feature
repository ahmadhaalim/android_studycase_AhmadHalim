@Android @Checkout
Feature: Checkout
  Background:
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo@gmail.com"
    And User input the password "mokahalim1234"
    And User click the sign in button

  Scenario: Checkout with One item with One quantity
    When User in the favourite page
    And User click the "Ice Cream" menu from the favourite page with 1 quantity
    And User see "Ice Cream" on the shopping cart with 1 quantity
    And User click the charge button
    And User input the amount of money "10000" from checkout pop up
    And User click the charge button from checkout pop up
    Then User see the receipt page with "No Change"

  Scenario: Checkout with One item with Two quantity
    When User in the favourite page
    And User click the "Ice Cream" menu from the favourite page with 2 quantity
    And User see "Ice Cream" on the shopping cart with 2 quantity
    And User click the charge button
    And User input the amount of money "20000" from checkout pop up
    And User click the charge button from checkout pop up
    Then User see the receipt page with "No Change"

  Scenario: Checkout with Two item with One quantity
    When User in the favourite page
    And User click the "Ice Cream" menu from the favourite page with 1 quantity
    And User click the "Fried Rice" menu from the favourite page with 1 quantity
    And User see "Ice Cream" on the shopping cart with 1 quantity
    And User see "Fried Rice" on the shopping cart with 1 quantity
    And User click the charge button
    And User input the amount of money "30000" from checkout pop up
    And User click the charge button from checkout pop up
    Then User see the receipt page with "No Change"

  Scenario: Checkout with Two item with Two quantity
    When User in the favourite page
    And User click the "Ice Cream" menu from the favourite page with 2 quantity
    And User click the "Fried Rice" menu from the favourite page with 2 quantity
    And User see "Ice Cream" on the shopping cart with 2 quantity
    And User see "Fried Rice" on the shopping cart with 2 quantity
    And User click the charge button
    And User input the amount of money "60000" from checkout pop up
    And User click the charge button from checkout pop up
    Then User see the receipt page with "No Change"

    Scenario: Checkout with one item with 2 quantity and another item with 1 quantity
      When User in the favourite page
      And User click the "Ice Cream" menu from the favourite page with 2 quantity
      And User click the "Fried Rice" menu from the favourite page with 1 quantity
      And User see "Ice Cream" on the shopping cart with 2 quantity
      And User see "Fried Rice" on the shopping cart with 1 quantity
      And User click the charge button
      And User input the amount of money "40000" from checkout pop up
      And User click the charge button from checkout pop up
      Then User see the receipt page with "No Change"