package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
//As the button element in under iframe so in that case we need to switch to iframe first
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).sendKeys("Tanishka The Great");
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclickbutton).perform();
		
        
        
	}

}
