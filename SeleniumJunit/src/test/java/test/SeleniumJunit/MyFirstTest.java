package test.SeleniumJunit;

import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;
import org.junit.Assert.*;


public class MyFirstTest extends TestCase{

	@Test
	public void firstTest() {

		//invoke .exe file
		System.setProperty("webdriver.chrome.driver", "/Users/vishalattray/eclipse-workspace/Vishal-Selenium/Drivers/chromedriver-3");
			
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver  driver = new ChromeDriver();
				 
		//Implement the method of web drive
				 
		//Go to the url
		driver.get("https://www.findmyfare.com/");
				 
		//Validate your page title is correct
		System.out.println(driver.getTitle());
		
		//Validate landed url
		System.out.println(driver.getCurrentUrl());
		
		//Print page source
		System.out.println(driver.getPageSource());
		
		//Go to the url
		driver.get("https://www.airbnb.com/");
		
		//Navigate back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		//Close current browser
		driver.close();
		
		//Close all the browsers
		driver.quit();
		
		assertTrue(true);

	}
	
	

}
