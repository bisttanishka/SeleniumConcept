package MyPracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	/*WebElement section=driver.findElement(By.xpath("//h2[text()=\"Up to 70% off | Clearance store\"]"));
	 //TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=section.getScreenshotAs(OutputType.FILE);
	   File trg=new File("D:\\AutomationLearning eclispe\\Selenium\\src\\main\\java\\ScreenShotPacjage\\featuredproducts.png");
	   
	   try {
			FileUtils.copyFile(src, trg);
			System.out.println("Screenshot saved to: " + trg);
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
			
		}*/
		
	WebElement section1=driver.findElement(By.xpath("//a[@aria-label=\"Amazon.in\"]"));
	
	 
	   File src=section1.getScreenshotAs(OutputType.FILE);
	   File trg=new File("D:\\AutomationLearning eclispe\\Selenium\\src\\main\\java\\ScreenShotPacjage\\logo.png");
	   
	   try {
			FileUtils.copyFile(src, trg);
			System.out.println("Screenshot saved to: " + trg);
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
			
		
		
	}

}
}
	
