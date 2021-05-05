#Unacademy:Siddhi Gawade

Feature: Angel List Page_Login Functionality

Background: 
Given user on the Angel List page  

#Verify Successful login with valid credentials

Scenario: Successful login  
Given user on the Login Page
And user enters "email address" with "shrutimore@gmail.com" 
And user enters "password" with "Welcome@Shruti"  
And user click "log in" button
Then user should see "Profile" 

#Verify Unsuccessful login with invalid credentials

Scenario: Unsuccessful login
Given user on the Login Page
And user enters "email address" with "shrutimor@gmail.com" 
And user enters "password" with "Welcome@Shryti"  
And user clicks "login" button
Then error message displayed with wrong password
