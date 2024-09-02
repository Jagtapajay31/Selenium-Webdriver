package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * POI: poor obfuscation implementation
 * 
 * Apache POI in Selenium:
 * The Apache POI in Selenium is a widely used API for selenium data driven testing.
 * It is a POI library written in Java that gives users an API for manipulating Microsoft documents like .xls and .xlsx.
 * Users can easily create, modify and read/write into excel files. POI stands for “Poor Obfuscation Implementation.”
 * 
 * Excel 97-2003 save file .xls
 * HSSF
 * 
 * Excel save file .xlsx
 * XSSF
 * 
 * steps:
 * 1: to open a excel file
 * 2: to open a particular sheet
 * 3: to select a particular row
 * 4: to select a particular col
 * 5: to get value from the cell
 * 
 * POI Framework
 * 1. data driven
 * 2. keyword driven
 * 3. hybird driven
 */
public class DataDrivenFW {
	
	public String[][] readData() throws InvalidFormatException, IOException {
		String[][] data = null;
		//1.to get a filepath
		String filepath= "C:\\Users\\os\\OneDrive\\Desktop\\DataDriven.xlsx";
		//2.to make file
		File file = new File(filepath);
		//3.to open a excel file
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		//4.to open a sheet
		Sheet sheet= workbook.getSheet("sheet1");
		//5.to select a row
		int n_row=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+n_row);
		data=new String[n_row][];
		for (int i = 0; i < data.length; i++) {
			Row row=sheet.getRow(i);
			
			//6.to get select col
			int n_col=row.getPhysicalNumberOfCells();
			System.out.println("no of col is :"+n_col);
			data[i]=new String[n_col];
			for (int j = 0; j < data[i].length; j++) {
				
				
				Cell cell=row.getCell(j);
				//7.to convert all value into string
				cell.setCellType(CellType.STRING);
				
				//8.to get value from the cell
				data[i][j]=cell.getStringCellValue();
			}		
		}
		
		return data;
	}

	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException {
		String[][] data=readData();
		
		for (int i = 0; i < data.length; i++) {
			
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("user-name")).sendKeys(data[i][0]);
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys(data[i][1]);
		Thread.sleep(2000);
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
	}
}
