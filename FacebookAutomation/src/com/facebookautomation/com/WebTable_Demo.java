package com.facebookautomation.com;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kavin\\eclipse-examples\\FacebookAutomation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().window().maximize();

		//PARTICULAR  DATA

		WebElement ele = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));

		System.out.println(ele.getText());
		System.out.println("completed");
		
		driver.close();

	}

}
