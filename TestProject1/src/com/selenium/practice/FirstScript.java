package com.selenium.practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\TestProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Launched browser successfully!!");
		driver.close();
	}

}
