package MyPracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class facebookSignUp {


@Test
	public static void facebookValidation() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	boolean disFacebook=driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
	//System.out.println("Is facebook displayed ? " +display);//if facebook image is displayed it will reture true.otherwise false.
	//with Assert//Make sure you have the necessary testing framework (TestNG or JUnit) set up in your project to use assertions.
    //Assert.assertTrue(disFacebook, "Not displayed");
    Assert.assertEquals(disFacebook,true);
    
    boolean display2=driver.findElement(By.xpath("//div[text()=\"Create a new account\"]")).isDisplayed();
    System.out.println("Create a new account display ?"  +display2);
    //Assert.assertEquals(display2,true, "Create a new account");
    
    boolean display3=driver.findElement(By.xpath("//div[text()=\"It's quick and easy.\"]")).isDisplayed();
   System.out.println("It's quick and easy. display ?"  + display3);
    //Assert.assertEquals(display3,"It's quick and easy.","incorrect value");
    
    WebElement E1= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
    String actualfirstname=E1.getAttribute("aria-label");
    Assert.assertEquals(actualfirstname, "First name","Placeholder value for first name is incorrect");
    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Prinkle");
    
    
    WebElement E2=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
    String actuallastname=E2.getAttribute("aria-label");
    Assert.assertEquals(actuallastname, "Surname","Placeholder value for lastname is incorrect");
    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Bisht");
    
    WebElement E3=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
    String actualMobNum=E3.getAttribute("aria-label");
    Assert.assertEquals(actualMobNum, "Mobile number or email address","Placeholder value for MobileNumber is incorrect");
    driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8989898989");
    
    WebElement E4=driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
    String actualPass=E4.getAttribute("aria-label");
    Assert.assertEquals(actualPass, "New password","Placeholder value for Password is incorrect");
    driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Prinkle@1234");
    
   WebElement day=driver.findElement(By.id("day"));
   WebElement month= driver.findElement(By.id("month"));
   WebElement year=driver.findElement(By.id("year"));

   dropdown(day,"8");
   dropdown(month, "Oct");
   dropdown(year, "1993");
  
   
 //  radiobutton(driver, By.xpath("//label[text()='Female']"));
   
   
  
  String gender = "Female";
  WebElement customElement = radiobutton(driver, gender);
 Assert.assertEquals(customElement.isSelected(),false);
 customElement.click();
 
 boolean text1=driver.findElement(By.xpath("//p[text()=\"People who use our service may have uploaded your contact information to Facebook. \"]")).isDisplayed();
 System.out.println("displayed ?"  + text1);
 boolean text2=driver.findElement(By.xpath("//a[text()=\"Learn more\"]")).isDisplayed();
 System.out.println("displayed ?" + text2);
driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();

  }  


public static void dropdown(WebElement drop, String value)

{
	Select select=new Select(drop);
	select.selectByVisibleText(value);
		
}

/*public static void radiobutton(WebDriver driver, By locator) {
	
	WebElement radioButton = driver.findElement(locator);
    radioButton.click();
}*/


public static WebElement radiobutton(WebDriver driver, String text) {
    String xpath = String.format("//span//label[text()='%s']", text);
   return driver.findElement(By.xpath(xpath));
   
   }



	
}

 
	


	

