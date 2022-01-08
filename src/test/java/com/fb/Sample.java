package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//property id=123
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Ram");
		
		driver.navigate().refresh();
		
		//property id=124
		WebElement findElement = driver.findElement(By.id("username"));
		element.sendKeys("pass");
		
		

}

}