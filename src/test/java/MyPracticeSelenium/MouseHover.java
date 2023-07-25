package MyPracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS );
		WebElement desktopHover=driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
		WebElement macHover=driver.findElement(By.xpath("//a[text()=\"Mac (1)\"]"));
	Actions action =new Actions(driver);
	action.moveToElement(desktopHover).moveToElement(macHover).click().perform();
	
	
	}
	

}
