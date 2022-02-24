package com.selenium.labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollDown_By_pixel {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\TestProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(3000);
		
		// This will scroll down page by 1000 pixel vertical
		
		js.executeScript("window.scrollBy(0,1000)");
	}

}
