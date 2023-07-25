package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class Lecture3 
{
    // TeatNG(if we use testng we don't need main method
	@Test 
	public void verifyGoogleLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//check the current url
		//https://www.google.com/
		
		String url= driver.getCurrentUrl();
	Assert.assertEquals("https://www.google.cm/", url);
	driver.close();

	
	}
}
