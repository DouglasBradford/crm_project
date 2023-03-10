@smoke @regression
Feature: As a user, I should be able to access the Chat and Calls module.

  Scenario: Verify chat and calls module feature
    Given the user logged in with username as "hr8@cydeo.com" and password as "UserUser"
    When the user clicks the "chat and calls" module
    Then verify user successfully goes to chats and call module




