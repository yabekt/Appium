package com.hrms.API.steps.practice;

import org.json.JSONArray;
import org.json.JSONObject;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class GETAllEmployees {
	private Response response;
	public static String Token;
	private static RequestSpecification request;
	
	@Given("user calls getAllEmployees to retrieve all employee")
	public void user_calls_getAllEmployees_to_retrieve_all_employee() {
	    request=given().header("Content-Type","application/json").header("Authorization",SyntaxAPIAuthenticationSteps.Token);
	}

	@When("User retrieves response for getAllEmployees to retrieve List of employees")
	public void user_retrieves_response_for_getAllEmployees_to_retrieve_List_of_employees() {
	    response=request.when().get(APIConstants.GET_ALL_EMPLOYEES_URI);
	    response.prettyPrint();
	}

	@Then("status code is {int} for getAllEmployees")
	public void status_code_is_for_getAllEmployees(int int1) {
		response.then().assertThat().statusCode(int1);
	    
	}

	@Then("user validates List of Employees is successfully Returned")
	public void user_validates_List_of_Employees_is_successfully_Returned() {
		JSONObject json=new JSONObject(response.prettyPrint());
		JSONArray array=json.getJSONArray("Employee");
		System.out.println("Size of list for returned Employee is: "+array.length());
		for(int i=0;i<=array.length()-1;i++) {
			String createdEmployee=response.jsonPath().getString("Employee["+i+"].emp_firstname");
			if(createdEmployee.equals("yaru")) {
				response.then().body("Employee["+i+"].emp_lastname", equalTo("T"));
				  response.then().body("Employee["+i+"].emp_middle_name", equalTo("B."));
				  response.then().body("Employee["+i+"].emp_gender", equalTo("1"));
				  response.then().body("Employee["+i+"].emp_birthday", equalTo("1981-02-22"));
				  response.then().body("Employee["+i+"].emp_status", equalTo("Employee"));
				  response.then().body("Employee["+i+"].emp_job_title", equalTo("Developer"));
				  System.out.println("Employee is found!!!!!");
				  break;
			  }else {
				  //System.out.println("Employee is NOT found!!!!!");
			  }
			}
		}
	    
	}


