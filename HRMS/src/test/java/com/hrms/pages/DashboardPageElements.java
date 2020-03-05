package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements {
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText="PIM")
	public WebElement pim;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmployee;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
