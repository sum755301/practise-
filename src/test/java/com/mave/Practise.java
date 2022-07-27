package com.mave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practise {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Framework\\Excel\\practise.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Day1");
		
//		int sheetrows = sheet.getPhysicalNumberOfRows();
//		System.out.println(sheetrows);
//		
//		
//		Row row = sheet.getRow(7);
//		
//		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//		System.out.println(physicalNumberOfCells);
//		
//		
//		for(int i=0; i<row.getPhysicalNumberOfCells(); i++) {
//			Cell cell = row.getCell(i);
//			System.out.println(cell);
//		}
		
		
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				
				CellType cellType = cell.getCellType();
				//System.out.println(cellType);
			switch(cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat g = new SimpleDateFormat("dd/MM/yyyy");
					String format = g.format(dateCellValue);
					System.out.println(format);
				}
				
				else {
					
				
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal b= BigDecimal.valueOf(numericCellValue);
				String string = b.toString();
				System.out.println(string);
				
				
				}
			
			
			}
				
				
				
			}
			
		}
		
		
	
		
		
		
		
		
	}

}
