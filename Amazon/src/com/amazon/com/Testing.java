package com.amazon.com;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\Amazon\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("7200678842");
		
		driver.manage().window().minimize();
		
		System.out.println("Please enter your password");
		
		String password=sc.next();
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.manage().window().maximize();

		driver.findElement(By.name("login")).click();
		
		
		
	}

}
