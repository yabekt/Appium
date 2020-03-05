package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		//Capturing alert message
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();

	}

}
