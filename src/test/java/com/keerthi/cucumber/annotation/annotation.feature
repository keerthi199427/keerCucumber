Feature: Facebook Page
#Scenario with AND
Scenario:
Given Iam on Facebook Login Page
When I Enter Username as "keerthi.kreativemind@gmail.com"
  When I Enter Password as "IIMvisakha142"
Then Login Should Pass
  Then Logout Should Pass
