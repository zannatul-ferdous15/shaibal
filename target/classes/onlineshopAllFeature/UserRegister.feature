
Feature: This feature is for register activity
@sign
Scenario: Verify user register
Given Open onlineshop "<URL>" application
When Click account link
When Enter user name and email and password and Click register button 
Then verify register successfully






