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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HybridDrivenFW {
	
	@DataProvider(name="tops")
	public Object[][] readData() throws InvalidFormatException, IOException {
		Object[][] data = null;
		//1.to get a filepath
		String filepath= "C:\\Users\\os\\OneDrive\\Desktop\\DataDriven.xlsx";
		//2.to make file
		File file = new File(filepath);
		//3.to open a excel file
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		//4.to open a sheet
		Sheet sheet= workbook.getSheet("sheet3");
		//5.to select a row
		int n_row=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+n_row);
		data=new Object[n_row][];
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
	@Test(dataProvider = "tops")
	public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException {
//		Object[][] data=readData();
		
//		for (int i = 0; i < data.length; i++) {
		
		if (keyword.equalsIgnoreCase("open browser")) {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		 	driver=new ChromeDriver();
		}else if (keyword.equalsIgnoreCase("enter url")) {
			driver.get(data);
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("enter username")) {
			driver.findElement(By.name("user-name")).sendKeys(data);
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("enter password")) {
			driver.findElement(By.name("password")).sendKeys(data);
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("click login")) {
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
		}else if (keyword.equalsIgnoreCase("close browser")) {
			driver.close();
		}
	}

//}
}
