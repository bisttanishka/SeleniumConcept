package MyPracticeSelenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTestng {

	 // TeatNG(if we use testng we don't need main method
		@Test
		public void validation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.googlee.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("http://www.google.com", url);
		
	
			
		driver.close();
	
		}
	


}