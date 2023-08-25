package MyPracticeSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBrokenLink {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("size of link"+links.size());
	
	int brokenlink = 0;
	int emptylink=0;
	int validlink=0;
	
	for(WebElement element:links) {
		
	String url=element.getAttribute("href");
	if(url==null||url.isEmpty()) {
		
		System.out.println("URL is empty");
		emptylink++;
		continue;
	}
	
	
	try
	{
		URL link=new URL(url);
		HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
		httpconn.connect();
		
		if(httpconn.getResponseCode()>=400)
		{
			System.out.println(httpconn.getResponseCode()+ url+"is" +"Broken Link");
			brokenlink++;
			
		}
		else 
		{
			System.out.println(httpconn.getResponseCode()+ url+"is" +"valid links");
			validlink++;
		}

	}
	catch(Exception e) {
		
		
	}
	}
	System.out.println("Number of broken link" +brokenlink);
	System.out.println("Number of broken link" +validlink);
	System.out.println("Number of broken link" +emptylink);
	driver.quit();
	}

}
