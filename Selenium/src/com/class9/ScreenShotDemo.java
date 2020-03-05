package com.class9;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import com.util.CommonMethods;
import com.util.Constants;

public class ScreenShotDemo extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome",Constants.HRMS_URL);
		String userName="Admin";
		String passWord="Hum@nhrm123";
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		String welcomeText=driver.findElement(By.id("welcome")).getText();
		if(welcomeText.contains(userName)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen,new File("ScreenShot/AdminLogin.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver.quit();
		
		
	}

}
