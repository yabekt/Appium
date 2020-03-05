package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class GETAllJobTitles {
	private Response response;
	public static String Token;
	private static RequestSpecification request;
	
	@Given("user calls jobTitle API to retrieve all job titles")
	public void user_calls_jobTitle_API_to_retrieve_all_job_titles() {
		request=given().header("Content-Type","application/json").header("Authorization",SyntaxAPIAuthenticationSteps.Token);
		//request.body(CommonMethods.readJson(APIConstants.GET_ALL_JOB_TITLES));
	    
	}

	@When("User retrieves response for jobTitle API to retrieve all Job Titles")
	public void user_retrieves_response_for_jobTitle_API_to_retrieve_all_Job_Titles() {
		response=request.when().get(APIConstants.GET_ALL_JOB_TITLES);
		response.prettyPrint();
	    
	}

	@Then("status code is {int} for jobTitle API")
	public void status_code_is_for_jobTitle_API(int int1) {
		response.then().assertThat().statusCode(int1);
	    
	}

	@Then("user validates Job Titles")
	public void user_validates_Job_Titles() {
		JSONObject json=new JSONObject(response.prettyPrint());
		JSONArray array=json.getJSONArray("Job Title List");
		for(int i=0;i<array.length()-1;i++) {
			System.out.println(array.get(i));
			if(i==0) {
				Assert.assertEquals("Cloud Architect", array.get(i));
			}else if(i==1) {
				Assert.assertEquals("Cloud Consultant", array.get(i));
			}
			
		}
		Assert.assertEquals(19, array.length());
	    System.out.println(array.length());
	}


}
