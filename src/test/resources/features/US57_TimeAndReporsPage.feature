Feature: As a user, I want to access the Time and Reports page.

 @wip
 Scenario: Verify the user to access the Time and Reports page.

   Given user logged in with username as "hr1@cydeo.com" and password as "UserUser"
   When user clicks the Time and Reports page
   Then user should be on worktime page
