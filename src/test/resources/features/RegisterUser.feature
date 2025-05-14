@TestFeature
Feature: Register user on automation exercise

  @RegisterUser @smokeTest
  Scenario Outline: Register user positive scenario
#    When Navigate to url '<URL>'
    Then Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then Verify 'New User Signup!' is visible
    Then Enter name 'test' and email address 'test@dj.com'
    And Click 'Signup' button on login page
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill account details
      | Title   | Name   | Email   | Password   | Date of birth   |
      | <Title> | <Name> | <Email> | <Password> | <Date of birth> |
    Then Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    Then Fill address details
      | First name   | Last name   | Company   | Address   | Address2   | Country   | State   | City   | Zipcode   | Mobile Number   |
      | <First name> | <Last name> | <Company> | <Address> | <Address2> | <Country> | <State> | <City> | <Zipcode> | <Mobile Number> |
    And Click 'Create Account' button on account creation page
    And Verify that 'ACCOUNT CREATED!' is visible on account home page
    And Click 'Continue' button account home page
    And Verify that 'Logged in as <Name>' is visible on account page
    And Click 'Delete Account' button account page
    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    Examples:
      | URL                                 | Title | Name | Email       | Password  | Date of birth | First name | Last name | Company | Address     | Address2 | Country       | State | City    | Zipcode | Mobile Number |
      | https://www.automationexercise.com/ | Mr    | Test | test@dj.com | Test@1234 | 11-11-2000    | Test       | Test      | FIS     | asj, yad 12 | Bass     | United States | LA    | NewYork | 223131  | 9327482343    |


  @LoginUser @smokeTest
  Scenario Outline: Login user positive scenario
    Then Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then Verify 'Login to your account' is visible on login page
    Then Enter email address '<Email>' and password '<Password>' on login page
    Then Click 'login' button on login button
    And Verify that 'Logged in as <Name>' is visible on account page
    And Click 'Delete Account' button account page
    Then Verify that 'ACCOUNT DELETED!' is visible after login
    Examples:
      | Name    | Email      | Password  |
      | Dheeraj | abc@ghj.mm | Test@1234 |

  @LogoutUser @smokeTest
  Scenario Outline: Logout user positive scenario
    Then Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then Verify 'Login to your account' is visible on login page
    Then Enter email address '<Email>' and password '<Password>' on login page
    Then Click 'login' button on login button
    And Verify that 'Logged in as <Name>' is visible on account page
    And Click 'Logout' button
    Then Verify 'Login to your account' is visible on login page
    Examples:
      | Name    | Email      | Password  |
      | Dheeraj | abc@ghj.mm | Test@1234 |