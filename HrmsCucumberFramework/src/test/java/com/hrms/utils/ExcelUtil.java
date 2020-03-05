package com.hrms.utils;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private static Workbook wbook;
	private static Sheet sheet;
	public static void openExcel(String filePath,String sheetName) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			wbook=new XSSFWorkbook(fis);
			sheet=wbook.getSheet(sheetName);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static int rowCount() {
		return sheet.getLastRowNum()-sheet.getFirstRowNum();
	}
	public static int colsCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	public static String getCellData(int rowIndex,int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}
	public static Object[][] excelIntoArray(String filePath,String sheetName){
		openExcel(filePath,sheetName);
//		int rows=rowCount();
//		int cols=colsCount();
		
		Object[][] data=new Object[rowCount()-1][colsCount()];
		for(int i=1;i<rowCount();i++) {
			for(int y=0;y<colsCount();y++) {
				data[i-1][y]=getCellData(i,y);
			}
		}
		return data;
	}

}
