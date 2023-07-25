package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge {

	public static void main(String[] args) {
	
		 WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		// driver.close();
		
		driver.findElement(By.name("A"));
		
		
	}

}
