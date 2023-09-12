Feature: Validating the login function of orange hrm
Scenario: Validating the login with user name and password
Given The user should be "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enters "Admin" and "admin123"
And click on login button
Then Validate whether the user successfully logged in
