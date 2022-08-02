package com.facebookautomation.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kavin\\eclipse-examples\\FacebookAutomation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.xpath("//a[@class= '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		create.click();

		Thread.sleep(3000);

		WebElement fname = driver.findElement(By.name("firstname"));

		fname.sendKeys("kavin");

		WebElement lname = driver.findElement(By.name("lastname"));

		lname.sendKeys("kumar");

		Thread.sleep(3000);

		WebElement phone = driver.findElement(By.name("reg_email__"));

		phone.sendKeys("7200678842");

		WebElement password = driver.findElement(By.xpath("//input[@name= 'reg_passwd__']"));

		password.sendKeys("Kavin@123");

		WebElement day = driver.findElement(By.xpath("//select[@name= 'birthday_day']"));

		Select s1 = new Select(day);

		s1.selectByValue("11");

		WebElement month = driver.findElement(By.xpath("//select[@name= 'birthday_month']"));

		Select s2 = new Select(month);

		s2.selectByVisibleText("Aug");

		WebElement year = driver.findElement(By.xpath("//select[@name= 'birthday_year']"));

		Select s3 = new Select(year);

		s3.selectByValue("1995");

		WebElement gender = driver.findElement(By.xpath("//input[@value= '2']"));

		gender.click();

		WebElement signup = driver.findElement(By.xpath("//button[@name= 'websubmit']"));

		signup.click();

	}

}
