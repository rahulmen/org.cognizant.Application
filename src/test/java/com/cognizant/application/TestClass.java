package com.cognizant.application;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass {
	
protected static WebDriver driver;
	
	@BeforeClass
	public static void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RXM05IL\\workspace\\corprateSecurity\\Resources\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
	}
	
	
	public String m2(){
		driver.manage().window().maximize();
		return driver.getTitle();
	}
	
	@Test
	public void m3(){
		System.out.println("The title of page is :" + new TestClass().m2());
	}
	
	@Test
	public void m4(){
		Assert.assertEquals(new TestClass().m2(), "Google");
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
