package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of min_slider x and y axis"+min_slider.getLocation());
		System.out.println("Height and width of min_slider"+min_slider.getText());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 80, 0).perform();
		
		System.out.println("Location of min_slider x and y axis"+min_slider.getLocation());
		System.out.println("Height and width of min_slider"+min_slider.getText());
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -80, 0).perform();
		

	}

}
