package com.application.library;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	public String getData(String sheetName,int rowNum,int cellNum){
		String val =  null;
		
		try {
			FileInputStream fis = new FileInputStream("//home/prasannakumar/workspace/Snapdeal/data/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			val = c.getStringCellValue();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}
	
}
