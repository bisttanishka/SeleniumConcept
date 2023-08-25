package RahulShettyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericPractice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	WebElement suggestiondrop=driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
	suggestiondrop.sendKeys("In");  
	
	dropdown("India",driver);
	driver.quit();

}
	public static void dropdown(String option ,WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait until the autocomplete options are visible
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item']")));
		List<WebElement> elementlist=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		
		for(WebElement elementdrop:elementlist) {
			
			if(elementdrop.getText().equalsIgnoreCase(option)) {
				
				elementdrop.click();
				break;
				
			}
			
		}
		
		// Add a small delay for the selection to take effect
        
            Thread.sleep(1000);
       
        }
		
		
	}


