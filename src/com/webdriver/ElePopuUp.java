package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElePopuUp {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String main_w=driver.getWindowHandle();
		System.out.println("main windows :"+main_w);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> all_w=driver.getWindowHandles();
		
		Iterator<String> i1=all_w.iterator();
		while (i1.hasNext()) {
			String child_w= (String) i1.next();
			System.out.println("child windows :"+child_w);
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("ajay@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				
				driver.close();
			}	
		}
		driver.switchTo().window(main_w);
		Thread.sleep(2000);
		driver.close();
	}
}
