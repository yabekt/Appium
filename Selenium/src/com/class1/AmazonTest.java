package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String alertMessage="";
//		driver.get("http://Amazon.com");
//		String actualTitle=driver.getTitle();
//		System.out.println(actualTitle);
//        driver.close();
		//driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.get("http://jsbin.com/usidix/1");
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.linkText("Deprecated")).click();
//        driver.close();
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();


	}

}
