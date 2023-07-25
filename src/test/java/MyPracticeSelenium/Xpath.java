package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//Relative Xpath
		//driver.findElement(By.xpath("//input[@id=\"search_query_top23\"]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
		
 //***********Or operator in relative xpath 
		
		//Relative Xpath
		//driver.findElement(By.xpath("//input[@id=\"search_query_top\" or @name=\"search_query\"]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
		
//****************And operator in relative xpath (Both should be true then only it will run) 
		
		
		//driver.findElement(By.xpath("//input[@id=\"search_query_top\" and @name=\"search_query\"]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
				
//**************xpath with contails	
		
		//driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
		
//**************xpath with Startwith	
		
				//driver.findElement(By.xpath("//input[startwith(@id,'query_top')]")).sendKeys("T-Shirts");
				//driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();

//**************xpath with text()	
				//driver.findElement(By.xpath("//a[text()='Women']")).click();	

//Chained x path
			
				driver.findElement(By.xpath("//form[@id=\"searchbox\"]//input[4]")).sendKeys("T-Shirts");// serachbox
				driver.findElement(By.xpath("//form[@id=\"searchbox\"]//button[1]")).click();
				 
				
				

				
	}

}
