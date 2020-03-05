package com.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelPra {
	@Test
	public void read() throws Exception {
		String Xfile="C:\\Users\\ybtib\\OneDrive\\Documents\\Test.xlsx";
		FileInputStream fio=new FileInputStream(Xfile);
		
		Workbook wbook=null;
		wbook=new XSSFWorkbook(fio);
		Sheet sheet=wbook.getSheet("Name");
		
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rows+1;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				//String value=sheet.getRow(i).getCell(j).toString();
				System.out.print(row.getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		wbook.close();
		fio.close();
		
	}

}
