package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class HomeWork3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		if(!(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected())){
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}else {
			System.out.println("Checkbox already selected");
		}
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		boolean displayed=driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
		if(displayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		driver.quit();


	}

}
