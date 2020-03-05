package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;

public class LoginPagesTest extends CommonMethods{
	@Test(groups="smoke")
	public void login() {
		//ConfigReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		LoginPage login=new LoginPage();
		sendText(login.username,ConfigReader.getProperty("username"));
		sendText(login.password,ConfigReader.getProperty("password"));
		click(login.loginBtn);
	}
	@Test(groups="regression")
	public void negativeLogin() throws InterruptedException {
		LoginPageElements login=new LoginPageElements();
		sendText(login.username,ConfigReader.getProperty("username"));
		click(login.loginBtn);
		String expectedError="Password cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expectedError,"Error message text is not matched");
		Thread.sleep(5000);
	}

}
