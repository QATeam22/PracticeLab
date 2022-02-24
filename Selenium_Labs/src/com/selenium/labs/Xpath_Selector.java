package com.selenium.labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Selector {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Labs\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("<Hello world>");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	
		
		System.out.println("Search using Xpath Selector is successfull");
		driver.close();
	}

}
