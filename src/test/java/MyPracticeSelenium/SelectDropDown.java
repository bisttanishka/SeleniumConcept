package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		Select color=new Select(dropdown);
		/*color.selectByVisibleText("Yellow");
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement dropdown1=driver.findElement(By.id("oldSelectMenu"));
		Select color1=new Select(dropdown1);
		color1.selectByValue("2");
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement dropdown2=driver.findElement(By.id("oldSelectMenu"));
		Select color2=new Select(dropdown2);
		color2.selectByIndex(4);*/
		
		//How to select option withoout using select method in dropdown
	//First get all the option in form od webelement
		
		List<WebElement> alloption=color.getOptions();
		System.out.println("Size of alloption"+ alloption.size());
		
		for(WebElement element:alloption) {
			if(element.getText().equals("Green")) {
				element.click();
				break;
			}
		}
		
		
	}

}
