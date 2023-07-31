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

public class JavaScriptExecuterOperations {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Draw Border and Take Screenshot
		/*WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptExecutor.drawBorder(logo,driver);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg= new File(".//ScreenShotFolder//logo.png");
		FileUtils.copyFile(src, trg);*/
		
		//Capture Title
		/*String title=JavaScriptExecutor.gettitle(driver);
		System.out.println(title);*/
		
		//Click Action
		/*WebElement reglink=driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		JavaScriptExecutor.actionclickReg(reglink,driver);*/
		
		//AlertMessage
		//JavaScriptExecutor.alert(driver,"This is Tanishka Alert");
		
		//Refreash Page
		//Thread.sleep(5000);
		//JavaScriptExecutor.refersh(driver);	
 
		//ScrollDown and up
		/*JavaScriptExecutor.scrollPageDown(driver);
		Thread.sleep(3000);
		JavaScriptExecutor.scrollPageUp(driver);*/
		
		//ScrollDown and Up by pixel (x,Y)
		/*JavaScriptExecutor.scrollPageDownpixel(driver);
		Thread.sleep(3000);
		JavaScriptExecutor.scrollPageUppixel(driver);	*/	
	
		//Scroll till element visible
		/*WebElement eleVisible=driver.findElement(By.xpath("//strong[text()=\"Featured products\"]"));
		JavaScriptExecutor.scrollPageElementVisible(driver, eleVisible);*/
		
		//Zoom
		
		JavaScriptExecutor.zoom(driver);
	}
	

}
