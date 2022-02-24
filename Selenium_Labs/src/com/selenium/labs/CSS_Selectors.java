package com.selenium.labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Labs\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("<Hello world>");
		driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
	
		
		System.out.println("Search using Css Selector is successfull");
		driver.close();
	}

}
