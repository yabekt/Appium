package com.class5;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class FrameDemo extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL = "jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		//Thread.sleep(2000);
		driver.switchTo().frame("FrameOne");
		driver.findElement(By.linkText("Home")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("FrameTwo");
		boolean logoDisplayed=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
		System.out.println("Syntax logo displayed "+logoDisplayed);
		driver.switchTo().defaultContent();
		driver.close();
		driver.quit();

	}

}
