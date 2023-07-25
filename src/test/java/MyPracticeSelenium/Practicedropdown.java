package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicedropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569894%7Cb%7Cfacebook%20login%20account%7C&placement=&creative=589460569894&keyword=facebook%20login%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-296914611740%26loc_physical_ms%3D9062082%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_NXAuZrD_wIV0JlmAh2yiw8HEAAYASAAEgJF7PD_BwE");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Taniska");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("Bisht");
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("7300584041");
		
		
		
		//driver.findElement(By.name("firstname")).sendKeys("Tanishka");
		
		
		

		
		
		
	}
}