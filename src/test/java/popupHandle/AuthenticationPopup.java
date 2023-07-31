package popupHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Here it will ask username and password. it before putting sytax for authentication popup
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//Syntax for Authentication Popup
		
		//http://username:password@URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
