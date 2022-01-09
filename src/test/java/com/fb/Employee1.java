package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee1 {
	
	@Parameters({"UserName","password"})
	
	@Test
	
	private void login(String name,String password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(password);
		
		System.out.println("dev");
		
		

	}

}
