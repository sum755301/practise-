package com.mave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Insertingvalues {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Framework\\Excel\\practise.xlsx");
		
		FileInputStream stream = new  FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Day1");
		
		
		Row createRow = sheet.createRow(16);
		Cell createCell2 = createRow.createCell(0);
		createCell2.setCellValue("SAIRA");
		Row row = sheet.getRow(4);
		Cell createCell = row.createCell(15);
		
		createCell.setCellValue("sumair");
		
		FileOutputStream a = new FileOutputStream(file);
		
		workbook.write(a);
		
		
		
		
	}

}
