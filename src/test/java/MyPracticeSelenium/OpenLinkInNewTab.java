package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//WebElement right=driver.findElement(By.linkText("Register"));
		//when you want to open link in new tab
		
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		
		//When you want to open link in same tab
       /* Actions actions = new Actions(driver);
        actions.contextClick(right).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
		*/
		
	
	}

}
