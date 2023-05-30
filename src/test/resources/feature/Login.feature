@Login
Feature: Login
  As a Registered User of the application
  I want to validate the Login functionality
  In order to check if it works as desired

  Background: A Registered User navigates to Login page
    Given I am a registered user
      And I navigate to the "sign-in" page

  @SuccessfulLogin
  Scenario Outline: Successful login using valid credentials
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    Then I should be successfully logged in
    And I should land on the Home page
    And I should see "Dashboard" and Sign out links
    And Close window
    Examples:
      | username			            |	password	        |
      |	alyashelya@gmail.com			|	fEhCJixR65FrTDe!	|

  @failedLogin
  Scenario Outline: Failed login using wrong credentials
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    And I should see message as "<alert>"
    And Close window
    Examples:
      | username                       | password                | alert           |
      | alyashelya@gmail.com	       | fEhCJixR65FrTDe!!		 | Sign in failed! |
      | Alyashelya@gmail.com	       | fEhCJixR65FrTDe!        | Sign in failed! |
      | lyashelya@gmail.com          | fehCJixR65FrTDe!         | Sign in failed! |
      | alyashelya@gmail.com         | fEhCJi                  | Sign in failed! |

  @DisabledLogin
  Scenario Outline: Disabled Login when one of the required fields is left blank
    When I fill in "sign-in__email" with "<username>"
    And I fill in "sign-in__password" with "<password>"
    And I click on the Sign In button
    Then I should see "<form error>" message for input field on Log In page
    And I should see Sign In buttton disbaled
    And I should not be able to submit the ".form__button" form
    And Close window
    Examples:
      | username              | password     | form error           |
      | 		              | Asdf@1234	 | Enter a valid email	|
      | arajw@gmail.com       | 		     | Enter a password     |