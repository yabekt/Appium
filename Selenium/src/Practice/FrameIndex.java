package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<=size;i++) {
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}

	}

}
