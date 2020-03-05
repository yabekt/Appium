package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		String MainWindow=driver.getWindowHandle();
		//to handle all opened window
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it=s1.iterator();
		while(it.hasNext()) {
			String ChildWnd=it.next();
			if(!MainWindow.equalsIgnoreCase(ChildWnd)) {
				driver.switchTo().window(ChildWnd);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@abc.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		driver.close();

	}

}
