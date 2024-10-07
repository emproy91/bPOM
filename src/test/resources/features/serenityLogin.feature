Feature: Login on the website

  @UserStory1
  Scenario Outline: testing the login module
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |
    Then will validate the text on screen <message>
    Examples:
      | message |
      | Tablero |

  @UserStory2
  Scenario Outline: testing the New Carrier module
    Given the user needs add new carrier
    When Provides the new carrier details
      | company  | phone     |
      | Atlas | 6641122334 |
    Then will validate the new company in the list <findC>
    Examples:
      | findC |
      | Atlas |