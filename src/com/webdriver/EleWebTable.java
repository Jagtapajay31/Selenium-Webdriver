package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleWebTable {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\os\\eclipse-workspace\\Selenium_22_may\\src\\com\\webdriver\\index2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		for (int i = 2; i <=5 ; i++) {
			for (int j = 1; j <=4 ; j++) {
			String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(" | "+data);
			}
			System.out.println();
			Thread.sleep(2000);
		}
	}
}
