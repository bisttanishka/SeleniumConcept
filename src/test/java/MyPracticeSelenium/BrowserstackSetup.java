package MyPracticeSelenium;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserstackSetup {
	public static final String USERNAME= "tanishkabisht_PAZnKt";
	public static final String AUTOMATE_KEY= "1pxTuXZy4zptaGXkuokT";
	public static final String URL= "https://"+ USERNAME + ":" +AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("os", "Windows");
		cap.setCapability("osVersion", "10");
		cap.setCapability("browserVersion", "114.0");
		cap.setCapability("projectName", "Browserstack");
		cap.setCapability("buildName", "Build1");
		cap.setCapability("sessionName", "Selenium search");
		cap.setCapability("local", "false");
		cap.setCapability("seleniumVersion", "3.14.0");
		
		WebDriver driver=new  RemoteWebDriver(new URL(URL), cap);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement google=driver.findElement(By.name("q"));
		google.sendKeys("selenium");
		google.sendKeys(Keys.ENTER);
		WebElement title=driver.findElement(By.xpath("(//a[@jsname=\"qOiK6e\"])[1]"));
		title.click();
		System.out.println("Title of selenium site" + driver.getTitle());
		driver.quit();
		

		
	}
	
	

}
