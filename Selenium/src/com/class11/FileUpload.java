package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome","https://the-internet.herokuapp.com/upload");
		//to upload file we use sendkeys method and provide full path to the file
		WebElement uploadDoc=driver.findElement(By.id("file-upload"));
		uploadDoc.sendKeys("C:\\Users\\ybtib\\OneDrive\\Documents\\hello.rtf");
		driver.findElement(By.id("file-submit")).click();
		WebElement uploaded=driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(uploaded.isDisplayed()) {
			System.out.println("File uploaded Successfully");
		}else {
			System.out.println("Failed");
		}
		//driver.quit();

	}

}