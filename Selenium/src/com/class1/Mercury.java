package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Yaru");
		driver.findElement(By.name("lastName")).sendKeys("Beke");
		driver.findElement(By.name("phone")).sendKeys("7878787878");
		driver.findElement(By.name("userName")).sendKeys("abc@yahoo.com");
		driver.findElement(By.name("register")).click();
		driver.close();

	}

}
