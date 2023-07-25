package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteGooglePlaces {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();
      WebElement autocomplete= driver.findElement(By.id("autocomplete"));
      autocomplete.clear();
      Thread.sleep(3000);
      autocomplete.sendKeys("Toronto");
      Thread.sleep(3000);
      String text;
      
      do {
    	  autocomplete.sendKeys(Keys.ARROW_DOWN);
    	  Thread.sleep(3000);
    	  text=autocomplete.getAttribute("value");
    	  if(text.equals("Toronto, OH, USA")) {
    		  autocomplete.sendKeys(Keys.ENTER);
    		  break;
    	  }Thread.sleep(3000);
      }
      while(!text.isEmpty());

	}

}
