package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
		driver.close();

	}

}
