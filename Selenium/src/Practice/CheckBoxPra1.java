package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPra1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		WebElement check1=driver.findElement(By.id("vfb-6-0"));
		WebElement check2=driver.findElement(By.id("vfb-6-1"));
		check1.click();
		check2.click();
		if(check1.isSelected()) {
			System.out.println("Checkbox is Toggled on");
		}else {
			System.out.println("Checkbox is Toggled off");
		}
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for(int i=0;i<2;i++) {
			 chkFBPersist.click (); 			
	         System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());		
		}

	}

}
