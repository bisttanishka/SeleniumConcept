package RahulShettyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3schooltable {


public static WebDriver driver;
@Test
public void launchURl() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
String companyname="Ernst Handel";

String[] info=getCompanyInfo(companyname);
if (info != null) {
	String company = info[0];
	String contact = info[1];
	String country = info[2];

	System.out.println("Company: " + company);
	System.out.println("Contact" + contact);
	System.out.println("Country: " + country);
     
} 
else 
{
    System.out.println("Company name not found");
}
driver.quit();
}

public static  String[] getCompanyInfo(String Companyname) {
	
	try {
		WebElement row=driver.findElement(By.xpath("//td[contains(text(), '"+ Companyname + "')]/ancestor::tr"));
		if(row!=null) {
		String Company=row.findElement(By.xpath("./td[1]")).getText();
		String Contact=row.findElement(By.xpath("./td[2]")).getText();
		String Country=row.findElement(By.xpath("./td[3]")).getText();
		return new String[]{Company, Contact, Country};
		}
	
	else {

		System.out.println("Row is null");
	}
	}
	catch (Exception e) {
		 e.printStackTrace();
		
	}
	return null;

	
	
	
	
	
	
	
	
}

}
