package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("Selenium");
    Thread.sleep(3000);
    
    List<WebElement> seleniumlist= driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]//div[1]//span"));
    System.out.println("Size of selenium list is "+seleniumlist.size());
    
    for(WebElement ele:seleniumlist) {
    if(ele.getText().equals("selenium webdriver")) {
    	ele.click();
    	break;
    }
    
    }
    
	}

}
