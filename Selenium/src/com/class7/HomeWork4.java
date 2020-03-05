package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class HomeWork4 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		if(!el.isEnabled()) {
			driver.findElement(By.xpath("//button[text()='Enable']")).click();
		}
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
		if(el.isEnabled()) {
			el.sendKeys("Hello");
			String value=el.getAttribute("value");
			if(value.equals("Hello")) {
				System.out.println("Text is "+value);
			}else {
				System.out.println("Fail");
			}
		}
		else {
			System.out.println("Failed to enable textbox");
		}
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.quit();

	}

}
