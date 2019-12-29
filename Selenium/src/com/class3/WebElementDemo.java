package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		//it will clear the text box or text area
		userName.clear();
		userName.sendKeys("helen");
		driver.findElement(By.xpath("")).sendKeys("helen@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement errorMess=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(errorMess.isDisplayed());
	}

}
