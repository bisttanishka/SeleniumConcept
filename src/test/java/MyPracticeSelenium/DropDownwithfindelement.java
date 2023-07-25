package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownwithfindelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		//WebElement day=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));
		//WebElement year=driver.findElement(By.id("year"));
		
		List<WebElement> yearlist=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println(yearlist.size());
for (int i=0;i<yearlist.size();i++) {
	
	String option=yearlist.get(i).getText();
	System.out.println(option);
	if(option.equals("1993")) {
	yearlist.get(i).click();
	
		
	}
	
}


List<WebElement> monthlist=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
System.out.println(monthlist.size());
for (int i=0;i<monthlist.size();i++) {

String option1=monthlist.get(i).getText();
System.out.println(option1);
if(option1.equals("Dec")) {
monthlist.get(i).click();

}

}

	}

}
