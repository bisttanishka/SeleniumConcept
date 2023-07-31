package MyPracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess {

	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
	       // options.setHeadless(true);
	     // options.addArguments("--Headless");
		 options.addArguments("--incognito");
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in");
	       System.out.println("Title:" +driver.getTitle());

	}

}
