package com.practice.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\AutomationPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));

		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));

		signin.click();

		WebElement name = driver.findElement(By.name("email_create"));

		Thread.sleep(3000);

		name.sendKeys("kavinracer3@gmail.com");

		WebElement create = driver.findElement(By.name("SubmitCreate"));

		create.click();

		Thread.sleep(3000);

		WebElement gender = driver.findElement(By.id("id_gender1"));

		gender.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(55));

		WebElement fname = driver.findElement(By.name("customer_firstname"));

		fname.sendKeys("kavin");

		WebElement lname = driver.findElement(By.name("customer_lastname"));

		lname.sendKeys("kumar");

		WebElement password = driver.findElement(By.name("passwd"));

		password.sendKeys("Kavin@123");

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));

		Select s = new Select(day);

		s.selectByValue("11");

		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));

		Select s1 = new Select(month);

		s1.selectByValue("8");

		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));

		Select s2 = new Select(year);

		s2.selectByValue("1995");

		WebElement newsletter = driver.findElement(By.name("newsletter"));

		newsletter.click();

		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));

		first.sendKeys("Kavin");

		WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));

		last.sendKeys("kumar");

		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));

		company.sendKeys("XYZ");

		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));

		address.sendKeys("3/74, malaiyandipattinam");

		WebElement address1 = driver.findElement(By.xpath("//input[@name='address2']"));

		address1.sendKeys("kuralkuttai, udumalpet");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));

		city.sendKeys("Tiruppur");

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));

		Select s3 = new Select(state);

		s3.selectByValue("5");

		WebElement zipcode = driver.findElement(By.xpath("//input[@name='postcode']"));

		zipcode.sendKeys("90211");

		WebElement info = driver.findElement(By.xpath("//textarea[@cols='26']"));

		info.sendKeys("Power full people come from power full places");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(66));

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));

		phone.sendKeys("9597909738");

		WebElement reference = driver.findElement(By.xpath("//input[@name='alias']"));

		reference.sendKeys("Vaaippu illa Raja");

		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));

		register.click();

	}

}
