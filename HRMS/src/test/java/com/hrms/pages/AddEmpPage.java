package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmpPage {
	@FindBy(id="firstName")
	public WebElement fn;
	
	@FindBy(id="middleName")
	public WebElement mn;
	
	@FindBy(id="lastName")
	public WebElement ln;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	public AddEmpPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
