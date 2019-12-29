package com.class5;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.CommonMethods;

public class DropDownRecap extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement dd=driver.findElement(By.id("select-demo"));
		//to work with dd, if the tagname starts with select, then we have to create a object of select class
		Select select=new Select(dd);
		select.selectByIndex(3);
		//selecting value by visible text
		select.selectByVisibleText("Friday");
		//select an item from dropdown using value attribute
		select.selectByValue("Sunday");
		//how to get the count of a dropdown items?
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		//storing the list of options in iterator so we can loop through
		Iterator<WebElement> it=options.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(1000);
		}

		System.out.println("Does this dd support multi select "+select.isMultiple());
	}

}
