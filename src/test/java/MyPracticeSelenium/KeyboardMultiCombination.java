package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMultiCombination {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        
        WebElement copy = driver.findElement(By.name("text1"));
        WebElement paste = driver.findElement(By.name("text2"));
        
        copy.sendKeys("Welcome Tanishka");
        Actions act = new Actions(driver);
        //Control+A
        
        
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();
        
        //Control+c
        
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        
        
        //Tab
        
        
        act.sendKeys(Keys.TAB).perform();
        
        //Control+v
 
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();
        
     if(copy.getAttribute("value").equals(paste.getAttribute("value"))){
    	 
    	System.out.println("It's matched");
     }
     else
    	 
    	 System.out.println("it'snot matched");
     
       
    }

}
