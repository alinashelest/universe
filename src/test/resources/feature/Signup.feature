@Registration
Feature: Registration
  As an Un-registered User of the application
  I want to validate the Registration functionality
  In order to check if it works as desired

  Background: User navigates to Registration page
    Given I am a un-registered user
    And I navigate to the "sign-up" page

  @SuccessfulRegistration
  Scenario Outline: Successful Registration using valid credentials
    When I fill in "sign-up__first-name" with "<name>"
    And I fill in "sign-up__last-name" with "<lastname>"
    And I fill in "sign-up__email" with "<email>"
    And I fill in "sign-up__password" with "<password>"
    And I fill in "sign-up__confirm-password" with "<confirm password>"
    And I click on the Register Now button
    Then I should be successfully registered
    And I should see message as "Congratulations!"
    And Close window
    Examples:
      | name    |lastname	|	email						|	password		|	confirm password	|
      |	asdf	| jdfks		|	alyashelya@gmail.com		|	5LCthfUeqsnUXLe!		|	5LCthfUeqsnUXLe!					|


  @DisabledRegistration
  Scenario Outline: Disabled Registration when one of the required fields is left blank
    When I fill in "sign-up__first-name" with "<name>"
    And I fill in "sign-up__last-name" with "<lastname>"
    And I fill in "sign-up__email" with "<email>"
    And I fill in "sign-up__password" with "<password>"
    And I fill in "sign-up__confirm-password" with "<confirm password>"
    And I click on the Register Now button
    Then I should see "<form error>" message for input field on Registration page
    And I should see Register Now buttton disbaled
    And I should not be able to submit the ".form__button" form
    And Close window
    Examples:
      | name        | lastname| email				    |	password   | confirm password   |	form error				|
      | 		    |         | asdf.asdf@example.com	|	Asdf@1234  | Asdf@1234			|	Enter first name		|
      | asdf        | asd     |		       				|	Asdf@1234  | Asdf@1234			|	Enter a valid email		|
      | asdf        |  asd    |asdf       				|	Asdf@1234  | Asdf@1234			|	Enter a valid email		|
      | asdf        |  asd    |asdf.asdf@example.com	|	Asdf@1234  |  		       		|	Confirm your password   |
      | asdf        |  asd    |asdf.asdf@example.com	| 		       | Asdf@1234			|	Passwords do not match	|
