@Android @Login
Feature: Login

  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo@gmail.com"
    And User input the password "mokahalim1234"
    And User click the sign in button
    Then User in the favourite page

  Scenario: login with correct phone number and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the phonenumber "08126022339"
    And User input the password "mokahalim1234"
    And User click the sign in button
    Then User in the favourite page

  Scenario: login with correct Email wrong Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo@gmail.com"
    And User input the password "mokahalim123"
    And User click the sign in button
    Then User see "Authentication failed. Please check your username and password."

  Scenario: login with correct Password wrong Email
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo@gmail.co"
    And User input the password "mokahalim1234"
    And User click the sign in button
    Then User see "Authentication failed. Please check your username and password."

  Scenario: login with correct Password wrong Phone Number
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the phonenumber "08126022338"
    And User input the password "mokahalim1234"
    And User click the sign in button
    Then User see "Authentication failed. Please check your username and password."

  Scenario: login with correct Phone Number wrong Password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the phonenumber "08126022339"
    And User input the password "mokahalim12"
    And User click the sign in button
    Then User see "Authentication failed. Please check your username and password."

  Scenario: login with wrong email and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo@mail.com"
    And User input the password "08126022339"
    And User click the sign in button
    Then User see "Authentication failed. Please check your username and password."

  Scenario: Inputting invalid email
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the email "halimprabowo"
    Then User see an error saying "Enter a valid email address"

  Scenario: Inputting invalid phonenumber
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input the phonenumber "123456"
    Then User see an error saying "Enter a valid phone number"



