package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class Lecture2 
{
    //Without TeatNG
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//check the current url
		//https://www.google.com/
		
		String url= driver.getCurrentUrl();
	Assert.assertEquals("https://www.google.com/", url);
	driver.close();

	
	}
}
