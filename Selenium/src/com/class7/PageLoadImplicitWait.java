package com.class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class PageLoadImplicitWait extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome","http://google.com");
		//page load waits until all elements on the page gets fully loaded
		//if element won't load within 30 seconds you will get TimeOutException
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("WrongName")).sendKeys("iPhone");
		driver.quit();
	}

}
