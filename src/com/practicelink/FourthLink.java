package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FourthLink {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Attribute
//		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Ajay@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123654");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[value='1']")).click();
//		Thread.sleep(2000);
		
		//id loging id not working
//		driver.findElement(By.id("email")).sendKeys("Ajay@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("123456789");
//		Thread.sleep(2000);
//		driver.findElement(By.id("u_0_9_EM")).click();
//		Thread.sleep(2000);
		
		//name
//		driver.findElement(By.name("email")).sendKeys("Ajay@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pass")).sendKeys("123456789");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
		
		//CSSId id is not working
//		driver.findElement(By.cssSelector("input#email")).sendKeys("Ajay@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456789");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button#u_0_9_EM")).click();
//		Thread.sleep(2000);
		
		//CSSClass
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("Ajay@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputtext _55r1 _6luy _9npi")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		Thread.sleep(2000);

		
		driver.close();	
		
		
	}
}
