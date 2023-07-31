package MyPracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsPortion {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
       WebElement portion= driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
       File src=portion.getScreenshotAs(OutputType.FILE);
       File trg=new File(".//ScreenShotFolder//potion.png");
       FileUtils.copyFile(src, trg);
       
	}

}
