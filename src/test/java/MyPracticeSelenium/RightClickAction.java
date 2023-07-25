package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	WebElement rightclickbutton = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	// To use mouse operation we need to use Action Class and make Action class object also
	
	Actions action=new Actions(driver);
    action.contextClick(rightclickbutton).perform();
	
	

	
	}

}
