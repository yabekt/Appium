package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		//finding Javascript Alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		//finding the button and click on it
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		//get the text from the UI or main window
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert text: "+alert.getText());
		alert.accept();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//p[text()='Click the button to dispaly an alert box']")).getText();
		System.out.println(text);
	}
}
