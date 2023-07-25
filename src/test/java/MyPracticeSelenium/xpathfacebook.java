package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathfacebook {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("bist.tanishka@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Oracle@0908");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"]")).sendKeys("Reema Bist");
		driver.findElement(By.xpath("//label[@class=\"x1a2a7pz x1qjc9v5 xnwf7zb x40j3uw x1s7lred x15gyhx8 x9f619 x78zum5 x1fns5xo x1n2onr6 xh8yej3 x1ba4aug xmjcpbm\"]")).click();
		//driver.findElement(By.xpath("//s//span[text()=\"Reema\"]")).click();
		

	}

}
