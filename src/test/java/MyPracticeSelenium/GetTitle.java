package MyPracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Title of the WebPage  "+driver.getTitle());
		System.out.println("Current URL" + driver.getCurrentUrl());
		//System.out.println("PageSource"+ driver.getPageSource());
			
		}
		

	}


