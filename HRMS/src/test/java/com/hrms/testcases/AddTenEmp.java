package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtil;

public class AddTenEmp extends CommonMethods{
	@DataProvider
	public Object[][] getEmpData(){
		return ExcelUtil.excelIntoArray(Constants.XL_DATA_FILEPATH, "TenEmp");
	}
	@Test()
	public void AddEmp(String uid,String pwd) {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		AddEmpPage addEmp=new AddEmpPage();
		sendText(login.username,uid);
		sendText(login.password,pwd);
		click(login.loginBtn);
//		click(dashboard.pim);
//		click(dashboard.addEmployee);
		//String welcomeText=dashboard.welcomeLnk.getText();
		//Assert.assertTrue(welcomeText.contains(uid), "User with username "+uid+" was not able to login");
	}
	

}
