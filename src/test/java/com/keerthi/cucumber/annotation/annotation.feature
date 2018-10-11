Feature: Facebook Page
#Scenario with AND
Scenario:
Given Iam on Facebook Login Page
When I Enter Username as "keerthi.kreativemind@gmail.com"
  When I Enter Password as "jklajfla"
Then Login Should Pass
