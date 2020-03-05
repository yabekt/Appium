package com.class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.Constants;

public class AddFiveEmpHW extends CommonMethods{
	@BeforeClass
	public void openBrowser() {
		setUp("chrome",Constants.HRMS_URL);
	}
	@BeforeMethod
	public void loginTest() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		Thread.sleep(5000);
		//driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		boolean welcomeDisplayed=driver.findElement(By.id("welcome")).isDisplayed();
//		Assert.assertTrue(welcomeDisplayed, "Welcome element is NOT displayed");
//		
	}
	@Test(dataProvider="getData")
	public void addEmp(String firstName,String lastName,String userName,String passWord)throws InterruptedException {
		//driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		
		//String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.id("chkLogin")).click();
		driver.findElement(By.id("user_name")).sendKeys(userName);
	    driver.findElement(By.id("user_password")).sendKeys(passWord);
	    driver.findElement(By.id("re_password")).sendKeys(passWord);
	    
	    driver.findElement(By.id("btnSave")).click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen,new File("ScreenShot/AddFiveEmp.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {
				{"YY","BB","YB","123456"},
				{"ZZ","AA","ZA","123456"},
				{"CC","DD","CD","123456"},
				{"EE","FF","EF","123456"},
				{"GG","HH","GH","123456"},
				
		};
		return data;
	}
	
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

}
