package com.class9;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.CommonMethods;

public class HW2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		String dateTime ="05/14/2020";
		setUp("chrome","https://www.aa.com/homePage.do");
		driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("IAH");
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(2000);
		WebElement nextLink=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-header')]//a[@class='ui-datepicker-next ui-corner-all']"));
		//WebElement preLink=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-header')]//a[@class='ui-datepicker-prev ui-corner-all']"));
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).sendKeys("05/14/2020");
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).sendKeys("11/08/2020");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen,new File("ScreenShot/AAReservation.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
        
        Thread.sleep(1000);

	}

}
