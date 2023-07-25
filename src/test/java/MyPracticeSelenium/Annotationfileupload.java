package MyPracticeSelenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationfileupload {

	static WebDriver driver;

/*@BeforeSuite //perform suite level setup task

public void beforeSuite(){
	System.out.println("Before Suite");
	
}

@AfterSuite //perform suitelevel teardown task

public void afterSuite(){
	System.out.println("After Suite");
	
}*/

//@BeforeTest
	@BeforeMethod
	public static void browser() throws Throwable 
{
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn__text\"]")).click();
	    System.out.println("Before Method : Successfull");
	}

	  

@AfterMethod 
public void afterTest()
{
    System.out.println("After Method : Successfull");
 
     driver.quit();
    
}


@Test(priority=1)

public void buttonClick() throws Throwable 
{
	
		WebElement button=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
	
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("D:\\CVSeleniumpractive\\ResumeS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);//it will press the control key in keyboard
		rb.keyPress(KeyEvent.VK_V);// it will press V key in keyboard
		rb.delay(2000); 		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);


		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span//input[@type=\"submit\"]")).click();
}	

@Test(priority=2)
public void login() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(By.id("file-upload")).sendKeys("D:\\CVSeleniumpractive\\ResumeS.docx");
    driver.findElement(By.id("pop_upload")).click();

}


}


	


