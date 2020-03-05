Feature: Verify Syntax /jobTitle.php HRMS API's
Background:
Given user generates token

#@SyntaxHRMSAPIEndToEnd
Scenario: This test to check to job titles
Given user calls jobTitle API to retrieve all job titles
When User retrieves response for jobTitle API to retrieve all Job Titles
Then status code is 200 for jobTitle API
Then user validates Job Titles
