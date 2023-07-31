package datePickerConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.findElement(By.id("dob")).click();
		
		//Selection of month &year 
		
		Select month=new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));
		month.selectByVisibleText("Sep");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")));
		year.selectByVisibleText("2022");
		
		//Date Selection
		
		String date="7";
		List <WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement ele:alldates) {
			String dt=ele.getText();
			
			if(dt.equals(date)) {
				ele.click();
				break;
				
			}
		}
		
	

	}

}
