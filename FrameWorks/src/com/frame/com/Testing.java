package com.frame.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\FrameWorks\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement enter = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		enter.click();
		
		WebElement parent = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		
		driver.switchTo().frame(parent);
		
		//WebElement child1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(0);
		
		WebElement child2 = driver.findElement(By.xpath("//input[@type='text']"));
		
		child2.sendKeys("test");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("C:\\Users\\Kavin\\eclipse-examples\\FrameWorks\\Screenshot\\Flipkart.png");
		
		FileUtils.copyFile(source, destination);
		
		System.out.println("Screenshot Taken");
		
		
		
		
		
		
		
		
		
		
		
	}

}
