package MyPracticeSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int brokenlink=0;
		for(WebElement element:links) {
		String url=element.getAttribute("href");
		if(url==null||url.isEmpty()) {
			System.out.println("URL is empty");
			continue;
		}
		
		try {
			URL alllinks=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection) alllinks.openConnection();
			httpcon.connect();
			
			if(httpcon.getResponseCode()>=400) {
				System.out.println(httpcon.getResponseCode() +url + "is" + "Broken Link");
				brokenlink++;
				 
			}
			else {
				System.out.println(httpcon.getResponseCode()+url +"is" + "Valid Link");
			}
			
		} 
		
		catch (Exception e) {
			
		}
				
		}
		
		System.out.println("Number of broken link" +brokenlink);
		
	}

}
