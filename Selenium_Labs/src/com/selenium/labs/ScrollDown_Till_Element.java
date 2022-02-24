package com.selenium.labs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ScrollDown_Till_Element {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\TestProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("testingDropdown"));
		
		// This will scroll down page till element is found
		
		js.executeScript("arguments[0].scrollIntoView();",element);
	}

}
