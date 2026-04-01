package com.kmg.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait;
	
	@Test
	public void print1st() {
		System.out.println("Printed 1st");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='here']")));
		AssertJUnit.assertTrue(ele.isDisplayed());
	}

	@Test
	public void print2nd() {
		System.out.println("Printed 2nd");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='here']")));
		ele.click();
		WebElement ele2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("emailid")));
		AssertJUnit.assertTrue(ele2.isDisplayed());
	}
	@Test
	public void print3rd() {
		System.out.println("Printed 3rd");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnLogin")));
		AssertJUnit.assertTrue(ele.isDisplayed());
	}
	@Test
	public void print4th() {
		System.out.println("Printed 4th");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("emailid")));
		ele2.sendKeys("testvendor172@gmail.com");
		AssertJUnit.assertTrue(true);
	}
	@Test
	public void print5th() {
		System.out.println("Printed 5th");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("emailid")));
		ele2.sendKeys("testvendor172@gmail.com");
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnLogin")));
		ele.click();
		WebElement ele3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='mngr657474 ']")));
		
		AssertJUnit.assertTrue(ele3.isDisplayed());
		driver.quit();
	}
}
