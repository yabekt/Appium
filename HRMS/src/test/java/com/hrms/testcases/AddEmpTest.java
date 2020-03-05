package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;



public class AddEmpTest extends CommonMethods {
	@Test(groups="regression")
	public void AddEmpValidation() {
	LoginPageElements login=new LoginPageElements();
	DashboardPageElements dashboard=new DashboardPageElements();
	AddEmpPage addEmp=new AddEmpPage();
	
	sendText(login.username,ConfigReader.getProperty("username"));
	sendText(login.password,ConfigReader.getProperty("password"));
	click(login.loginBtn);
	click(dashboard.pim);
	click(dashboard.addEmployee);
	
	sendText(addEmp.fn,"yyyyyyy");
	sendText(addEmp.mn,"bbbbbbb");
	sendText(addEmp.ln,"ccccccc");
	
	
	}
	

}
