package com.mave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelday1 {
	
	public static void main(String[] args) throws IOException {
		
	File file = new File("C:\\Users\\user\\eclipse-workspace\\Framework\\Excel\\practise.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Day1");
	
	Row row = sheet.getRow(4);
	System.out.println(row);
	
	Cell cell = row.getCell(5);
	System.out.println(cell);
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	
	  for(int i = 0; i<row.getPhysicalNumberOfCells();i++) {
		  Cell cell2 = row.getCell(i);
		  System.out.println(cell2);
		   
		  
	  }
		
	  for(int j = 0; j<sheet.getPhysicalNumberOfRows();j++) {
		  Row row2 = sheet.getRow(j);
		for(int k= 0; k<row2.getPhysicalNumberOfCells();k++) {
			Cell cell2 = row2.getCell(k);
			System.out.println(cell2);
		}
	  }
	  
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
