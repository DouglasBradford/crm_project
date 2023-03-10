@yana @smoke @regression
Feature: Users should be able to navigate and click the Employees module

  Background: User already logged in and sees the profile page

  Scenario: Verify users can access Employees module and see horizontal menu bar
    Given the user logged in with username as "hr6@cydeo.com" and password as "UserUser"
    When the user is on the homepage and clicks the Employees module
    Then the user sees the horizontal menu bar

      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |
