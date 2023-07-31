package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement inputbox=driver.findElement(By.xpath("//input[@id=\"age\"]"));
	String tooltip=inputbox.getAttribute("title");
	Assert.assertEquals(tooltip,"We ask for your age only for statistical purposes.");
	System.out.println(tooltip);
		Thread.sleep(5000);
		driver.close();
		

	}
	

}
