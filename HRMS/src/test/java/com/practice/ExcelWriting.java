package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriting {
	@Test
	public void ExcelWrite()throws Exception {
		String filePath="C:\\Users\\ybtib\\OneDrive\\Documents\\Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wbook= new XSSFWorkbook(fis);
		Sheet sh=wbook.getSheet("Name");
		sh.getRow(3).createCell(0).setCellValue("user");
		sh.getRow(3).createCell(1).setCellValue("user123");
		sh.createRow(4).createCell(0).setCellValue("Admin");
		sh.getRow(4).createCell(1).setCellValue("Admin123");
		FileOutputStream fos=new FileOutputStream(filePath);
		wbook.write(fos);
		wbook.close();
		fos.close();
		
	}

}
