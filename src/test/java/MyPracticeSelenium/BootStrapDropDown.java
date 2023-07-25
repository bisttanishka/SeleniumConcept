package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]")).click();
		//BootStrap is having anchor tag rather the select
		//Productype
		List<WebElement> productType= driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		System.out.println("Size of ProductType"+productType.size());
		dropDown(productType,"Accounts");
		
		//Product
		
		driver.findElement(By.xpath("//div[@class=\"drp2\"]//div[@class=\"dropdown\"]")).click();
		List<WebElement> product= driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		System.out.println("Size of Product"+product.size());	
		dropDown(product,"Current Accounts");
		
	
		
	}

	//Generic method
	public static void dropDown(List<WebElement> option,String value) {
	
		for(WebElement ptype:option) {
			
		if(ptype.getText().equals(value)) {
			ptype.click();
			break;
		}
		}
	}
}
