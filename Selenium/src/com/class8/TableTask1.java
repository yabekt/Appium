package com.class8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;
import com.util.Constants;

public class TableTask1 extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome",Constants.SYNTAX_PRACTICE);
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Number of rows in the table is= "+rows.size());
		System.out.println("Printing row data");
		Iterator<WebElement> rowsIt=rows.iterator();
		while(rowsIt.hasNext()) {
			String rowData=rowsIt.next().getText();
			System.out.println(rowData);
		}
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("Number of cols in the table is = "+cols.size());
		System.out.println("Printing columns");
		for(WebElement col:cols) {
			String header=col.getText();
			System.out.println(header);
		}
		System.out.println("Cell using advance for loop");
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellData = cell.getText();
			System.out.println(cellData);
		}
		driver.quit();
	}

}
