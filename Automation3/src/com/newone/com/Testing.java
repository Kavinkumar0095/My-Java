package com.newone.com;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Testing {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\Automation3\\src\\com\\newone\\com\\Testing.java");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("7200678842");
		
		driver.manage().window().minimize();
		
		System.out.println("Please enter your password");
		
		String password = sc.next();
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		pass.sendKeys(password);
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		
		
		
		
	}
	

}
