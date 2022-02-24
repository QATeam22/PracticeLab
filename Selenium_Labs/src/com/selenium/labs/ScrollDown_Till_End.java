package com.selenium.labs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Till_End {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\TestProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(2000);		
		
		// This will scroll the web page till end
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
