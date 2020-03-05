package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class FileUploadHW extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome","http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		//to upload file we use sendkeys method and provide full path to the file
		WebElement uploadDoc=driver.findElement(By.id("gwt-debug-cwFileUpload"));
		uploadDoc.sendKeys("C:\\Users\\ybtib\\OneDrive\\Documents\\hello.rtf");
		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();
		WebElement uploaded=driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(uploaded.isDisplayed()) {
			System.out.println("File uploaded Successfully");
		}else {
			System.out.println("Failed");
		}
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen,new File("ScreenShot/Fileupload.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
