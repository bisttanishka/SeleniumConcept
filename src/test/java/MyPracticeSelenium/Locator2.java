package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//Class Locator (The Elements find how how many elements are there.
		
		int slidercount= driver.findElements(By.className("homeslider-container")).size();
		System.out.println(slidercount);
		
	//Tagname
		int linksize= driver.findElements(By.tagName("a")).size();
     System.out.println(linksize);
     
	
	
	}


}
