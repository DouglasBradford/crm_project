@smoke @regression @wip
Feature: As a user, I want to see mobile app options to download

  Background: The user is logged in to the application and on the homepage

  @B28G37-102
  Scenario: Verify mobile app options are displayed on the homepage
    Given the user logged in with hr credentials username as "hr4@cydeo.com" and password as "UserUser"
    And the user is on the landing page
    Then verify the following mobile app options are displayed
      | APP STORE   |
      | GOOGLE PLAY |
@B28G37-103
  Scenario: Verify mobile app options are displayed on the homepage
    Given the user logged in with hr credentials username as "helpdesk4@cydeo.com" and password as "UserUser"
    And the user is on the landing page
    Then verify the following mobile app options are displayed
      | APP STORE   |
      | GOOGLE PLAY |
@B28G37-104
  Scenario: Verify mobile app options are displayed on the homepage
    Given the user logged in with hr credentials username as "marketing4@cydeo.com" and password as "UserUser"
    And the user is on the landing page
    Then verify the following mobile app options are displayed
      | APP STORE   |
      | GOOGLE PLAY |