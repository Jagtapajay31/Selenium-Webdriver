package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EleKeyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement email=driver.findElement(By.name("email"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("ajay")
				.keyUp(email, Keys.SHIFT)
				.contextClick(email)
				.build();
		a1.perform();
		Thread.sleep(2000);
		driver.close();
	}
}
