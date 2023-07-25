package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	//Tag and Id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("bist.tanishka@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("bist.tanishka@gmail.com");

//In tage and class combination it's putting password in email box only bcz class name is same in email and password box so it will take the one which come first . So to overcome this Tag and attribute combi we can use
		//Tag and Class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Oracle@0908");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Oracle@0908");
		
//Tag and attribute
		//driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("Oracle@0908");
		driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("Oracle@0908");

//Tag,class and attribute
		//driver.findElement(By.cssSelector("input.inputtext[id=\"email\"]")).sendKeys("bist.tanishka@gmail.com");//Email
		//driver.findElement(By.cssSelector("input.inputtext[id=\"pass\"]")).sendKeys("Oracle@0908");//Password
		
//Hit logib cutton
		driver.findElement(By.name("login")).click();
		

	}

}
