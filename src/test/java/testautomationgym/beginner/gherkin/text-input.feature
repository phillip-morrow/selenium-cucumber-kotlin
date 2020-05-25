Feature: Text input form

  Background: User navigates to text input in beginner
    Given I am on the "Home Page"
    And I click the "Beginner" menu option
    And I click the "1.1 Text" link

  Scenario: User types value into text input field
    And I type "a random string" into the "text" field
    Then The "You did it message" will display
