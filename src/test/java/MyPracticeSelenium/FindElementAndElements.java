package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        //FindElement-> Reture the single webElement
        
       /* driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Mobile");
        
        // This will return first Element bcz we have put  FindElement
        WebElement Element=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//li//a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        System.out.println(Element.getText());
        
        //This will throw nosuchelement Exception
       driver.findElement(By.xpath("//button[@type=\"login\"]")).click();*/
        
      //___________FindElements() Return multiple web Element__________________
        
        List<WebElement> listElement=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//li//a"));
        System.out.println("Size of the list: " + listElement.size());
        
       JavascriptExecutor js1= (JavascriptExecutor) driver;
        for (WebElement element : listElement) {
        	 js1.executeScript("arguments[0].scrollIntoView();",element);
            System.out.println(element.getText());
            
        }
           
        
	}

}
