package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;
import com.util.Constants;

public class ExplicitWaitDemo extends CommonMethods {
	/*
	 * Navigate to the page click on the others
	 * select dynamic data loading
	 * click get new user
	 * verify/validate that first name element is displayed
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.SYNTAX_PRACTICE);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[starts-with(text(), 'First Name')]")));
		boolean displayed=driver.findElement(By.xpath("//p[starts-with(text(), 'First Name')]")).isDisplayed();
		if(displayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
