package com.automation2.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\Automation2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.google.com/");
		
	}

}
