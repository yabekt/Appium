package firsttestngpackage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.Constants;

public class TNHW1 extends CommonMethods{
	@BeforeMethod
	public void openAndNavigate() {
		setUp("chrome",Constants.HRMS_URL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		boolean isDisplayed=driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();
		if(isDisplayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
}
