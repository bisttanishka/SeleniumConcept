package Selenium.Selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class Lecture1 
{
    //Without TeatNG
	
	public static void main(String[] args){
		
		//1. Define the path of the chrome driver.
		//System.setProperty("webdriver.chrome.driver", "D:\\Browser Binaries\\chromedriver_win32\\chromedriver.exe");
		//String driverPath="D:\\AutomationLearning eclispe\\Selenium\\chromedriver.exe";
		// String driverPath1="‪D://AutomationLearning eclispe//chromedriver.exe";
		
		//2. Set the chrome driver instance
		
		System.setProperty("webdriver.chrome.driver","D:\\AutomationLearning eclispe\\Selenium\\chromedriver.exe");
		
		//3.Create instance of chrome driver
		
		WebDriver driver=new ChromeDriver(); 
		
		//4. Launch the URL
		
		driver.get("http://www.google.com");
		
		
		
		
			
		
		
		
	}
}
