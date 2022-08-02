package com.alertt.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Document;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\Alertt\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//WebElement element = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='abc@gmail';");
		
		WebElement scroll = driver.findElement(By.xpath("//a[@title=\"Check out Facebook games.\"]"));
		
		js.executeScript("arguments[0].scrollIntoView()",scroll);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
