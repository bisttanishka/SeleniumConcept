package MyPracticeSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSortedOrUnsorted {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpElement);
		List<WebElement>options=drpselect.getOptions();
		
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options) {
		//Copy the all option into two different list	
		originallist.add(option.getText());
		templist.add(option.getText());
		}
		
		System.out.println("Original list"+originallist);
		System.out.println("temp list"+templist);
		
		Collections.sort(templist);
		System.out.println("Original list"+originallist);
		System.out.println("Sorted temp list"+templist);
		
		//now compare sorted templist with originallist
		
		if(originallist.equals(templist)) {
			System.out.println("DropDown is sorted");
		}
		else
		{
			System.out.println("DropDown is unsorted");
		}
		driver.close();
		}
		
		
	}


