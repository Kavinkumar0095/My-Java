package com.keyboard.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavin\\eclipse-examples\\KeyboardActions\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement best = driver.findElement(By.xpath("//a[@data-csa-c-content-id =  'nav_cs_bestsellers']"));
		
		Actions ac= new Actions(driver);
		
		ac.doubleClick(best).build().perform();
		
		
	
	}

}
