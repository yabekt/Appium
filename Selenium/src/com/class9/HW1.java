package com.class9;

import org.openqa.selenium.By;

import com.util.CommonMethods;
import com.util.Constants;

public class HW1 extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();

	}

}
