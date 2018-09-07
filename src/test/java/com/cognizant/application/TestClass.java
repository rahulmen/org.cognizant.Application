package com.cognizant.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass {
	
protected static WebDriver driver;
	
	@BeforeClass
	public static void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RXM05IL\\workspace\\corprateSecurity\\Resources\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
	}
	
	@Test
	public String m2(){
		driver.manage().window().maximize();
		return driver.getTitle();
	}
	
	@Test
	public void m3(){
		System.out.println("The title of page is :" + new TestClass().m2());
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
