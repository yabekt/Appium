package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.util.CommonMethods;

public class DragDropHW extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(3000);
		
		

	}

}
