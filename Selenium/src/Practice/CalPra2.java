package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalPra2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flydubai.com/en/");
		 
	    //*****Departure day selection started.
	    //Click Departure Date
	    driver.findElement(By.xpath("//img[@src='/system/img/calendar.svg']")).click();
	 
	    //Wait until departure table visible
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//img[@src='/system/img/calendar.svg']")).get(0)));
	 
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
	    //*****Departure day selection finished.
	 
	    //*****Return day selection started
	    //Click Return Date
	    driver.findElement(By.id("return-date")).click();
	 
	    //Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(1)));
	 
	    //Click return day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2017'][data-pika-month='11'][data-pika-day='29']")).get(1).click();
	    //*****Return day selection finished.
	 
	    //Check the operation in 5 seconds
	    Thread.sleep(5000);
	}

	}


