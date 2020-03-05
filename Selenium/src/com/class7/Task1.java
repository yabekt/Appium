package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait=new WebDriverWait(driver,35);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
		System.out.println("Pass");
		Thread.sleep(3000);
		driver.quit();


	}

}
