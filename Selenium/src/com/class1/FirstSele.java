package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl="http://demo.guru99.com/test/link.html";
		//String expectedTitle = "Welcome: Mercury Tours";
		//String actualTitle="";
		//launch chrome and direct ot base url
		driver.get(baseUrl);
//		actualTitle=driver.getTitle();
//		
//		if(actualTitle.contentEquals(expectedTitle)) {
//			System.out.println("Test Passed");
//		}else {
//			System.out.println("Test Failed");
//		}
		driver.findElement(By.linkText("click here")).click();
		System.out.println("title of the page is: "+driver.getTitle());
		
		//driver.close();

	}

}
