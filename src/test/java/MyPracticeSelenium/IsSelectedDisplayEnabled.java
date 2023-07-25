package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedDisplayEnabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		boolean display = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).isDisplayed();
        System.out.println("Is content display in seearch box"+display);
        boolean enable=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).isEnabled();
        System.out.println("Is the serach Box is enabled"+ enable);
        
	}

}
