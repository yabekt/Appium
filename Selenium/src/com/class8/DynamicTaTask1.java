package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class DynamicTaTask1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		String expectedValue="Susan Susan McLaren";
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		for(int i=1;i<rows.size();i++) {
			String rowText=rows.get(i-1).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[13]")).click();
			}
		}
		Thread.sleep(4000);
		//driver.close();	
		}
	}


