package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		driver.findElement(By.linkText("Home")).click();

	}

}
