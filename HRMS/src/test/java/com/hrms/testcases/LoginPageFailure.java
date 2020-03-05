package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;

public class LoginPageFailure extends CommonMethods{
	@Test
	public void loginFailure() {
		LoginPage login=new LoginPage();
		sendText(login.username,"Admin");
		sendText(login.password,"");
		click(login.loginBtn);
	}

}
