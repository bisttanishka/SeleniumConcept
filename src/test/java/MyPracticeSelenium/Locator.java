package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) {
	//open browser	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.pl/index.php");
	driver.manage().window().maximize();
	
	//Id locator
	WebElement searchbox=driver.findElement(By.id("search_query_top"));
	searchbox.sendKeys("T-Shirts");
	
	//name locator
	driver.findElement(By.name("submit_search")).click();  
	
	//LinkText and Partial link Text
	//driver.findElement(By.linkText("Blouse")).click();
	driver.findElement(By.partialLinkText("Blou")).click();
	
	
	
	}

}
