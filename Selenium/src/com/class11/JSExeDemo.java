package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;
import com.util.Constants;

public class JSExeDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement loginBtn= driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,22050)");
		Thread.sleep(5000);
		driver.quit();

	}

}
