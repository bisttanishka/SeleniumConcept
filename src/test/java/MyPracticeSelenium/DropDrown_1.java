package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDrown_1 {
static WebDriver driver;
@Test
	public static void dropDown()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		
		String day_xpath="//select[@id=\"day\"]//option";
		String month_xpath="//select[@id=\"month\"]//option";
		String year_xpath="//select[@id=\"year\"]//option";
		
		selectDropDownValue(day_xpath,"8");
		selectDropDownValue(month_xpath,"Oct");
		selectDropDownValue(year_xpath,"2001");
		
	}
public static void selectDropDownValue(String xpathValue, String value)
{
	List<WebElement> listopt=driver.findElements(By.xpath(xpathValue));
	System.out.println(listopt.size());
	for (int i=0;i<listopt.size();i++) {

	System.out.println(listopt.get(i).getText());
	if(listopt.get(i).getText().equals(value))
	{
		listopt.get(i).click();
	break;
	}
	}
}
}



