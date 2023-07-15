Feature: Demo web shop feature

  Background:
    Given The test will run on chrome

    Scenario Outline: Login into the demo web shop and buy computer
      Given Demo web shop is open
      And User enter <Username> and <Password> on login page
      And User logins successful
      When home page is open, user select computers
      Then User select type of computer needed
      And User buy the computer

      Examples:
      |Username|Password|
      | LMasekoameng@inspiredtesting.com | Lesi@6228                |

