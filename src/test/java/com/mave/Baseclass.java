package com.mave;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public void getNav(String url) {
		driver.navigate().to(url);

	}
	
	public void navBack() {
		driver.navigate().back();

	}
	
	public void navForward() {
		driver.navigate().forward();
	}
	
	public void navRefresh() {
		driver.navigate().refresh();

	}
	
	public static void getMaximize() {
		driver.manage().window().maximize();

	}
	
	public static void implict(int arg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg));

	}
	
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;

	}
	
	public WebElement findElementByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;

	}
	
	public WebElement findElementByclass(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;

	}
	
	public WebElement findElememtByXpath(String attributevalue) {
		WebElement element = driver.findElement(By.xpath(attributevalue));
		return element;
		
	}
	

	public void sendkeys(WebElement element,String Data) {
		element.sendKeys(Data);

	}
	
	public void click(WebElement element) {
		element.click();

	}
	
	public void closeallwindow() {
		driver.quit();

	}
	
	public void closecurrentWindow() {
		driver.close();

	}
	
	public void threadsleep(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
		
	}
	
	// 1%
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
		
	}
	//99%
	public String getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}
	
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}
	
	
	
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}
	
	public void dradanddrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		
	}
	
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}
	
	public void robotShift() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_SHIFT);

	}
	
	public void robotEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public void robotTab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}
	
	public void robotup() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);

	}
	
	public void robotDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

	}
	
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public void dismissalert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	
	public void promptAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);

	}
	
	public void scrollDown(WebElement scrollDown) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview(true)", scrollDown);

	}
	
	public void scrollup(WebElement scrollup) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview(false),", scrollup);
  
		
	}
	
	public void screenShot(String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(screenshotAs, file);

	}
	
	public void screenShotParticularWebElement(WebElement element, String path) throws IOException {
		TakesScreenshot screenshotAs1 = (TakesScreenshot) driver;
		File s = element.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(s, file);
	}
	
	public void selectByindex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}
	
	public void selectByVisibleText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}
	
	public  int optionscount(List<WebElement> options) {
		int size = options.size();
		return size;

	}
	
	public WebElement get(List<WebElement> options, int index) {
		WebElement element = options.get(index);
		return element;
		

	}
	
	public void frameByid(String id) {
		driver.switchTo().frame(id);

	}
	
	public void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}
	
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);

	}
	
	public void defaultFrame() {
		driver.switchTo().defaultContent();

	}
	
	public String getparentwindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
		

	}
	
	public Set<String> getAllwindowIds() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}
	
	public void switchToWindow(String windowId) {
		driver.switchTo().window(windowId);

	}
	
	public void clear(WebElement element) {
		element.clear();

	}
	
	
	
	public void writedata(String sheetname,int rowno, int cellno, String data) throws IOException {
	
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Framework\\Excel\\demo.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet(sheetname);
		
		Row row = sheet.getRow(rowno);
		
		Cell createCell = row.createCell(cellno);
		
		createCell.setCellValue(data);
		
		FileOutputStream o = new FileOutputStream(file);
		
		workbook.write(o);
		
		
		
	}
	
	
	
	public void insertData(String sheet,int row,int cell,String olddata, String newdata) throws IOException {
		
		File file = new File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Framework\\\\Excel\\\\practise.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet2 = workbook.getSheet(sheet);
		
		Row row2 = sheet2.getRow(row);
		
		Cell cell2 = row2.getCell(cell);
		
		String value = cell2.getStringCellValue();
		
		if(value.equals(olddata)) {
			cell2.setCellValue(newdata);
		}

		FileOutputStream o = new  FileOutputStream(file);
		
		workbook.write(o);
		
	}
	
	
	
	public String getdata(String sheetname,int rownum, int cellno) throws IOException {
		String res = null;
		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Testng\\Excel\\demo.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet(sheetname);
		
		Row row = sheet.getRow(rownum);
		
		Cell cell = row.getCell(cellno);

		CellType cellType = cell.getCellType();
		
		switch(cellType) {
		
		case STRING:
			
			res = cell.getStringCellValue();
			break;
			
		case NUMERIC:
			
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateformat.format(dateCellValue);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				res = valueOf.toString();
			}
			break;
			
			}
		return res;
		
		}
		

	}
	
	
	


