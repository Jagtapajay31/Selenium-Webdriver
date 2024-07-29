package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*Action Class:
 * Action Class in Selenium is a built-in feature provided by the selenium for handling keyboard and mouse events.
 * It includes various operations such as multiple events clicking by control key, drag and drop events and many more.
 * These operations from the action class are performed using the advanced user interaction API in Selenium Webdriver.
*/	
public class Ele_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flight=driver.findElement(By.linkText("Flights"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
//		WebElement car rental=driver.findElement(By.linkText("Car Rentals"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flight).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(hotels).build();
		a3.perform();
		Thread.sleep(2000);
		
//		Action a4=actions.moveToElement(car rental).build();
//		a3.perform();
//		Thread.sleep(2000);
		
		driver.close();
	}
}