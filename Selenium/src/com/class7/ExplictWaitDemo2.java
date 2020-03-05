package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class ExplictWaitDemo2 extends CommonMethods {
	/*
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://google.com");
		driver.findElement(By.name("q")).sendKeys("Wegmans");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		WebDriverWait wait=new WebDriverWait(driver,35);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in")));
		driver.findElement(By.id("sign-in")).click();
		System.out.println("button was clicked");
		Thread.sleep(3000);
		driver.quit();

	}

}
