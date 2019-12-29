package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("VanEarl");	                   
		driver.findElement(By.id("txtPassword")).sendKeys("VanEarl@&12");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Welcome Van")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		/*if(driver.getCurrentUrl().equals("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard")) {
			System.out.println("Login sucessful");
		}
		else {
			System.out.println("Login failed");
		}*/
		driver.close();

	}

}
