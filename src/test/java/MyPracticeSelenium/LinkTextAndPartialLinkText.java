package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//LinkText()->In this we need to pass the complete text or value
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		//PartialLinkText()->In this we need to pass portion of text or value
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//How to capture all the link and size of link
		/*List<WebElement> Links=driver.findElements(By.tagName("a")); //->This will capture all the links
		System.out.println(Links.size());*/
		
		//Now we need to print the name of link with actual link in console
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		//1.forloop
		/*for(int i=0;i<Links.size();i++) {
			
	System.out.println(Links.get(i).getText());
	System.out.println(Links.get(i).getAttribute("href"));
		}*/
		
		//2.Foreach loop
		for(WebElement element:Links) {
			System.out.println(element.getText());
			System.out.println(element.getAttribute("href"));
		
	 
			
		}
		
	}
	
}
