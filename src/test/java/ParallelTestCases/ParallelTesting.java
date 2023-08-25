package ParallelTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver;
@Test(priority=-1)
public void launchAmazon() {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
}

@Test(priority=0)
public void launchFlipkart() {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
}

@Test(priority=1)
public void launchMyntra() {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	
}

@Test(priority=2)
public void launchMeesho() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.meesho.com/");
	
}

@Test(priority=3)
public void launchAjio() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	
}

@Test(priority=4)
public void launchRelaince() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.reliancedigital.in/");
	
}

@Test(priority=5)
public void launchChroma() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.croma.com/");
	
}

@Test(priority=6)
public void launchZudio() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.zudio.com/");
	
}

@Test(priority=7)
public void launchWestside() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.westside.com/");
	
}

@Test(priority=8)
public void launchLevis() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.levi.in/");
	
}


}
