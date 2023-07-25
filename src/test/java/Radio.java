import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	@Test

		public static void facebookValidation() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			  String gender = "Custom";
		        WebElement customElement = findElementByText(driver, gender);
		       Assert.assertEquals(customElement.isSelected(), false);
	}
			  
	public static WebElement findElementByText(WebDriver driver, String text) {
        String xpath = String.format("//span//label[text()='%s']", text);
       return driver.findElement(By.xpath(xpath));
				    
					
				}
			  
			
	}

