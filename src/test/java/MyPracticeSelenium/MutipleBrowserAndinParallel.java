package MyPracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleBrowserAndinParallel {

WebDriver driver;
@Parameters("browsername")
@BeforeTest
public void setup(String browsername) {
	System.out.println("Browser name is :"+browsername);
	if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browsername.equalsIgnoreCase("edge")){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
}
	
@Test
public void test1() {
	driver.get("https://www.google.com");	
}
@AfterTest
public void closeBrowser() {
	driver.close();
	System.out.println("Test completed successfully");
}
	}
	

