package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\TestProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByIndex(1);
		Thread.sleep(1000);
				
		dropdown.selectByValue("Database");		
		Thread.sleep(1000);
		
		System.out.println("Closing browser!!");
		driver.close();
	}

}
