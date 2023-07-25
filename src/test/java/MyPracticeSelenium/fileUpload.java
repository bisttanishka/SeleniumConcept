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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUpload {
@Test
	public static void fileUploadTest() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn__text\"]")).click();
		
//-------------This is with sendKey Method -> And we use sendkey when we have input type=file in inspect
		/*driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("D:\\CVSeleniumpractive\\ResumeS.docx");
		driver.findElement(By.xpath("//span//input[@type=\"submit\"]")).click();*/
		
//--------------Sometimes we con't find input type in inspect at that time we need to use Robot Class
		
		WebElement button=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		
//********Robot Class************

		Robot rb=new Robot();
		rb.delay(2000);
		
//copy path and put in clipboard

		StringSelection ss= new StringSelection("D:\\CVSeleniumpractive\\ResumeS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.delay(2000);

// Paste the copied file to filename box Ctrl+V
		rb.keyPress(KeyEvent.VK_CONTROL);//it will press the control key in keyboard
		rb.keyPress(KeyEvent.VK_V);// it will press V key in keyboard
		rb.delay(2000);

		//after copying also we need to release the button 
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);

// Now the cursor will move to open so we need to hit enter 
		
		rb.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span//input[@type=\"submit\"]")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
