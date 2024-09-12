Feature: This feature is for verify login activity



Scenario: Verify user login

Given Open onlineshop "<URL>" application
When Click account link
When Enter user name and password and Click login button 
Then verify login successfully
Then click logout button






