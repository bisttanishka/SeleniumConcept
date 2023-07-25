package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
     driver.findElement(By.id("justAnInputBox")).click();	
     //selectChoice(driver,"choice 2");
     //selectChoice(driver,"choice 2","choice 2 1","choice 2 2","choice 6","choice 6 1");
     selectChoice(driver,"All");
	}
	
	public static void selectChoice(WebDriver driver, String...value) {
    
		List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		if(!value[0].equalsIgnoreCase("all"))//it ignore casesensitive also
		{
			for(WebElement item:choiceList) {
				
				String stritem=item.getText();
				
				for(String val :value) {
					if(stritem.equals(val)) {
					item.click();
					break;
					}
				}
			}
		}
		
		else
		{
		for(WebElement eleall:choiceList) {
			eleall.click();
			
		}
		}
	}
}
		
	
		
	


