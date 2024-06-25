package com.portal.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver;
	
	@BeforeSuite
	public void startbrowser() {
		
		//EdgeOptions options = new EdgeOptions();
		ChromeOptions options =new ChromeOptions();

		//Launch the chrome browser
		options.addArguments("--remote-allow-origins=*");
		// System.setProperty("Webdriver.edge.driver","C:\\Users\\lenovo\\eclipse-workspace\\SDET_saucedemo\\src\\msedgedriver.exe");
		//driver = new EdgeDriver(options);
		driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//maximize the window
		driver.manage().window().maximize();
		//user naviagtes to the sauce demo portal 
		driver.get("http://www.saucedemo.com");
		
	
		
		
		
	}
	// close the browser
	@AfterSuite
	public void closebrowser() {
		driver.quit();
	}
}
