package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("http://www.syntaxtechs.com");
		//driver.close();
		driver.navigate().back();
		driver.navigate().forward();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//refresh
		driver.navigate().refresh();

	}

}
