package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptInputBox {

	public static void main(String[] args) {
	//How to open web browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement Actions=driver.findElement(By.id("Email"));
		//getAttribute reture value of the given attribute
		System.out.println("The getAttribute()"+ Actions.getAttribute("value"));
		Actions.clear();
		Actions.sendKeys("Tanishka");
	
		
		driver.close();
		

	}

}
