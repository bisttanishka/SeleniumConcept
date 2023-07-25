package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fcampaign%2Flanding.php%3Fcampaign_id%3D14884913640%26extra_1%3Ds%257Cc%257C589460569870%257Cb%257Cfacebook%2Bcreate%2Baccount%257C%26placement%26creative%3D589460569870%26keyword%3Dfacebook%2Bcreate%2Baccount%26partner_id%3Dgooglesem%26extra_2%3Dcampaignid%253D14884913640%2526adgroupid%253D128696221432%2526matchtype%253Db%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-12091220328%2526loc_physical_ms%253D9062082%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%253D%26gclid%3DCjwKCAjwp6CkBhB_EiwAlQVyxTjwLI7d8nTm1hY52uXzPzmTUaw2MltkBVVXC4LT6UuGWddxvebCQRoCbKAQAvD_BwE&locale=en_GB&display=page");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("day"));
		WebElement element1= driver.findElement(By.id("month"));
		WebElement element2=driver.findElement(By.id("year"));
		
        
// to select the value from dropdown list there is select class for that.	
//	Select select = new Select(element);
//	select.selectByVisibleText("6");
//	Select select1 =new Select(element1);
//	select1.selectByVisibleText("Sep");
	
//	Select select2 =new Select(element2);
//	select2.selectByVisibleText("2001");
	
//Now if there any many dropdown to select then doing this will create time waste and repetative task. So to avoid this see below:
//Here you have 3 dropdown do you created three selet class. but if you have many dropdown so you can't do that.
// Now if i don't need to change evertime dob from selelctdrodown().So for that we use split funstion.
		
		String dob="7-Sep-2001";
		String dobarr[]= dob.split("-");
		
		selectDropDown(element,dobarr[0]);
		selectDropDown(element1,dobarr[1]);
		selectDropDown(element2,dobarr[2]);
		
		Thread.sleep(1000);	
		WebElement element3=driver.findElement(By.xpath("//span[@class=\"_5k_2 _5dba\"]/input[preceding-sibling::label[text()=\"Female\"]]"));
	    element3.click();		
	}
	
public static void selectDropDown(WebElement drop, String value) {
	
	Select select =new Select(drop);
	select.selectByVisibleText(value);
	
	
}

}
