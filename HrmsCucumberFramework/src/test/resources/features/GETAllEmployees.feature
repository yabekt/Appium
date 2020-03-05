Feature: Verify Synatx /getAllEmployees.php

Background:
Given user generates token

@SyntaxHRMSAPIEndToEnd
Scenario: This test to check to all employess
Given user calls getAllEmployees to retrieve all employee
When User retrieves response for getAllEmployees to retrieve List of employees
Then status code is 200 for getAllEmployees
Then user validates List of Employees is successfully Returned