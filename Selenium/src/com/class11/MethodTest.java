package com.class11;

import com.util.CommonMethods;

public class MethodTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://expedia.com");
		Thread.sleep(3000);
		scrollDown(1000);
		Thread.sleep(3000);
		scrollUp(500);
		Thread.sleep(3000);
		driver.quit();

	}

}
