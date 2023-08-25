package DockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxDemo {
	
@Test
public void testApp() throws MalformedURLException, InterruptedException {
	
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName(BrowserType.FIREFOX);
	
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	//driver.findElement(By.name("q")).sendKeys("Learn Automation");
	Thread.sleep(5000);
	driver.close();
	
	
}
}
