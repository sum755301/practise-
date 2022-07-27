package com.mave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoautomation {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Framework\\Excel\\demo.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Sheet1");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select select = new Select(findElement);
		
		List<WebElement> options = select.getOptions();
		
		for(int i=0;i<options.size(); i++) {
			
			WebElement element = options.get(i);
			
			String text = element.getText();
	
		
			Row createRow = sheet.createRow(i);
			
			Cell createCell = createRow.createCell(1);
			
			
			createCell.setCellValue(text);
			
			FileOutputStream z = new FileOutputStream(file);
			workbook.write(z);
			
		}
		
		
		

	}

}
