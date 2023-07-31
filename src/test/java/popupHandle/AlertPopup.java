package popupHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Single alert with Ok button
		
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();*/
		
		//Comfirmation alert with Ok and cancel button
		
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss()*/
		
		//Prompt alert with ask user to input something and then ok or cancel 
	driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
	Thread.sleep(3000);
	Alert alertprompt=driver.switchTo().alert();
	System.out.println("Message displayed on prompt alert" +alertprompt.getText());
	alertprompt.sendKeys("Welcome Onboard");
	alertprompt.accept();

	}

}
