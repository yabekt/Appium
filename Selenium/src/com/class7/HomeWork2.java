package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.util.CommonMethods;
import com.util.Constants;

public class HomeWork2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Sohilaryan");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax@12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		/*Actions action = new Actions(driver);
        WebElement btn = driver.findElement(By.id("menu_pim_addEmployee"));
        action.doubleClick(btn).perform();*/
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Yared");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Pass");
		Thread.sleep(3000);
		driver.quit();





	}

}
