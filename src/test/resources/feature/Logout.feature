@Logout
Feature: Logout
  As a Looegd in User of the application
  I want to Logout successfully

  Background: User is logged in and is on Homepage
    Given I am a logged in user
    And I navigate to the "Homepage" page

  @SuccessfulLogout
  Scenario: Successful Logout
    When I click on Logout link on the Home page
    Then I should be successfully logged out
    And Close window
