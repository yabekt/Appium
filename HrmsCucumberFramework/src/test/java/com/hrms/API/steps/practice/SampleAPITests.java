package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleAPITests {
	//@Test
	public void getAllJobTitles() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI4MjQxNTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjkzOTM1MywidXNlcklkIjoiNzQifQ.8n2ebgfz2_XcZ-9bBcSypOIrAml-9_9U03jhqyjHi_w")
				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}
	//@Test
	public void getOneEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI4MjQxNTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjkzOTM1MywidXNlcklkIjoiNzQifQ.8n2ebgfz2_XcZ-9bBcSypOIrAml-9_9U03jhqyjHi_w")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		response.prettyPrint();
		int actualResponseCode=response.getStatusCode();
		System.out.println(actualResponseCode);
	}
	//@Test
	public void getALLEmployeeStatuses() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MDM5MzgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzAxOTEzOCwidXNlcklkIjoiNzQifQ.Q8n6V2FApTeurTFdqqs82NNPaXmA5CMzi7xh9ncvNwo")
				.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();

		System.out.println(actualStatusCode);
	}
	@Test
	public void createEmployee() {

		Response response = RestAssured.given().urlEncodingEnabled(true).header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MDM5MzgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzAxOTEzOCwidXNlcklkIjoiNzQifQ.Q8n6V2FApTeurTFdqqs82NNPaXmA5CMzi7xh9ncvNwo")

		.param("emp_firstname", "newName")
		.param("emp_lastname", "employee")
		.param("emp_middle_name", "syntax")
		.param("emp_gender", "2")
		.param("emp_birthday", "1991-04-22")
		.param("emp_status", "Employee")
		.param("emp_job_title", "Developer")
		.contentType("application/json")
				.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");

		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);

	}


}
