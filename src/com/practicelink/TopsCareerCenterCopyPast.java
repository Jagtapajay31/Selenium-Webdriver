package com.practicelink;

import java.security.KeyStoreSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TopsCareerCenterCopyPast {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.id("mobile"));
		WebElement pass=driver.findElement(By.id("password"));

		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(name).click().sendKeys("9727843389").keyDown(name, Keys.CONTROL).sendKeys(name, "ac")
				.keyUp(name, Keys.CONTROL).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(pass).keyDown(pass, Keys.CONTROL).sendKeys(pass ,"v").keyUp(pass, Keys.CONTROL).build();
		a2.perform();
		Thread.sleep(5000);
		driver.close();
	}
}
