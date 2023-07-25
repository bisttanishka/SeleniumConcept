package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericForMultipleDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		dropdown(day,"7");
		dropdown(month,"Sep");
		dropdown(year,"1993");

	}
	
	public static void dropdown(WebElement drop,String value) {
		
		Select drp=new Select(drop);
		//option.selectByVisibleText(value);
		//we can also do without selectmethods
		
		List<WebElement> alloption=drp.getOptions();
		for(WebElement option:alloption ) {
			if(option.getText().equals(value)) 
			{
				
				option.click();
				break;
			}
		}
	}

}
