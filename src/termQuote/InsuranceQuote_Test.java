package termQuote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsuranceQuote_Test {

	@Test
	public void Quotetest() {
	//Navigating to the AAA Traditional Term Quote page	
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	// Checking Product link
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		Assert.assertEquals(driver.getTitle(), "Term Life Insurance | AAA Life Insurance Company");
		driver.navigate().back();
	// Checking learn and plan link
		driver.findElement(By.xpath("//a[text()='Learn & Plan']")).click();
		Assert.assertEquals(driver.getTitle(), "Getting Started | AAA Life Insurance Company");
		driver.navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	// Checking Customer Support
		driver.findElement(By.linkText("Customer Support")).click();
		Assert.assertEquals(driver.getTitle(), "Let Us Help | AAA Life Insurance Company");
		driver.navigate().back();
	// Checking Get a Term Quote
		driver.findElement(By.linkText("Get a Term Quote")).click();
		Assert.assertEquals(driver.getTitle(), "Term Life Insurance Quote | AAA Life Insurance Company");
		driver.navigate().back();
	// Sending Zipcode
		driver.findElement(By.id("zip")).sendKeys("48085");
	// Selecting Gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByIndex(2);
	// Selecting Date of Birth
		Select dobM= new Select(driver.findElement(By.id("month")));
		dobM.selectByIndex(6);
		Select dobD= new Select(driver.findElement(By.id("day")));
		dobD.selectByIndex(11);
		Select dobY= new Select(driver.findElement(By.id("year")));
		dobY.selectByIndex(28);
	// Choosing if a member
		driver.findElement(By.id("isMemberNo")).click();
	// Sending EmailID
		driver.findElement(By.id("contact_email")).sendKeys("rethriya@gmail.com");
	//Selecting Height
		Select heightFt= new Select(driver.findElement(By.id("feet")));
		heightFt.selectByIndex(2);
		Select heightIn= new Select(driver.findElement(By.id("inches")));
		heightIn.selectByIndex(5);
	//Sending Weight
		driver.findElement(By.id("weight")).sendKeys("115");
	//Choosing if used Nicotine
		driver.findElement(By.id("nicotineUseNo")).click();
	//Rating the Health
		Select health= new Select(driver.findElement(By.id("rateYourHealth")));
		health.selectByIndex(1);
	//Selecting Coverage Amount
		Select coverage= new Select(driver.findElement(By.id("coverageAmount")));
		coverage.selectByIndex(10);
	// Selecting term Length
		Select termLength= new Select(driver.findElement(By.id("termLength")));
		termLength.selectByIndex(1);
	//Click to see the Quote
		driver.findElement(By.id("seeQuote")).click();
		driver.navigate().back();
		driver.close();
	}
	
	
}

