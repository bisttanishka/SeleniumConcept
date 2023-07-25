package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1.Select specific checkbox
		//driver.findElement(By.id("wednesday")).click();
       
		//2.How to select all the checkboxes
		/*List<WebElement> alldays=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
		System.out.println("size of days"+ alldays.size());
		for(WebElement selectalldays: alldays) {
			System.out.println(selectalldays.getAttribute("id"));
			selectalldays.click();
			
		}*/
		
		//3.Multiple choice Monday&Sunday
		/*List<WebElement> alldays=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
	     for(WebElement selectchoice:alldays) {
	    	 
	    	 String text=selectchoice.getAttribute("id");
	    	 if(text.equals("monday")||text.equals("sunday")||text.equals("friday")) {
	    		 selectchoice.click();
	    	 }
	     }*/
	     
	     //4. select first two days
		/*List<WebElement> alldays=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
		int totalcheckboxes=alldays.size();
		for(int i=totalcheckboxes-2;i<totalcheckboxes;i++) {
			alldays.get(i).click();
		}*/
		
		//5. Select last 2 days
		List<WebElement> alldays=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
		int totalcheckboxes=alldays.size();
		for(int i=0;i<totalcheckboxes;i++) {
		
			if(i<3) {
			alldays.get(i).click();
		}
	     
	}

	}
}
