package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.util.CommonMethods;

public class BetekristianTest extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome","https://betekristian.org/am");
		driver.findElement(By.xpath("//i[@class='fa fa-angle-down']")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.id("at-svg-facebook-1")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen,new File("ScreenShot/BetekristiaErr.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
