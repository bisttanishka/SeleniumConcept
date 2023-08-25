package RahulShettyPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class PracticePage {
	public static final String USERNAME= "tanishkabisht_PAZnKt";
	public static final String AUTOMATE_KEY= "1pxTuXZy4zptaGXkuokT";
	public static final String URL= "https://"+ USERNAME + ":" +AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException  {
DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("os", "Windows");
		cap.setCapability("osVersion", "10");
		cap.setCapability("browserVersion", "114.0");
		cap.setCapability("projectName", "Practicepage");
		cap.setCapability("buildName", "Build2");
		cap.setCapability("sessionName", "Practice serach");
		cap.setCapability("local", "false");
		cap.setCapability("seleniumVersion", "3.14.0");
		
		WebDriver driver=new  RemoteWebDriver(new URL(URL), cap);
	
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Radio Button
		
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		
		//Suggestion dropdown
		WebElement suggestiondrop=driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		suggestiondrop.sendKeys("In");
		Thread.sleep(2000);
		
		List<WebElement> elementlist=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]//div[@class=\"ui-menu-item-wrapper\"]"));
		
		for(WebElement elementdrop:elementlist) {
			
			if(elementdrop.getText().equalsIgnoreCase("india")) {
				
				elementdrop.click();
			}
			
		}
		
		//Dropdown
		WebElement selectdrop=driver.findElement(By.xpath("//select[@name=\"dropdown-class-example\"]"));
		Select option=new Select(selectdrop);
		option.selectByValue("option2");
		
		//Checkbox select all 
		
		List<WebElement> checkboxlist=driver.findElements(By.xpath("//div[@id=\"checkbox-example\"]//input[@type=\"checkbox\"]"));
		System.out.println(checkboxlist.size());
		for(WebElement ele:checkboxlist) {
			String checkboxname= ele.getAttribute("value");
			if(checkboxname.equals("option1")|| checkboxname.equals("option2")) {
				ele.click();
			}
			//ele.click();
			
		}
		
	   driver.findElement(By.id("openwindow")).click();
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		String parentwindowId=it.next();
		String childwindowId=it.next();
		
		System.out.println("ParentwindowId" +parentwindowId);
		System.out.println("ChildwindowId" +childwindowId);
		
		String title=driver.switchTo().window(childwindowId).getTitle();
		System.out.println(title);
		driver.switchTo().window(parentwindowId);
	
		
		/*List<String> windowlist= new ArrayList(windowIds);
		for(String winId:windowlist) {
			
			System.out.println(winId);
			String title=driver.switchTo().window(windowlist.get(1)).getTitle();
			System.out.println(title);
			
		}*/
		
		//Switch to tab
		
		driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
		Set<String> tabIds=driver.getWindowHandles();
		
		ArrayList<String> tabs=new ArrayList(tabIds);
		String titletab=driver.switchTo().window(tabs.get(1)).getTitle();
		System.out.println(titletab);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
		//Alert
		driver.findElement(By.xpath("//input[@name=\"enter-name\"]")).sendKeys("Tanishka");	
	    driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	     Alert alert=driver.switchTo().alert();
	     String alertmsg=alert.getText();
	     Thread.sleep(4000);
	     System.out.println(alertmsg);
	     alert.accept();
	     Thread.sleep(3000);
	     
	     
	     	  
	  int row= driver.findElements(By.xpath("//table[@class=\"table-display\"]//tr")).size();
	  int col= driver.findElements(By.xpath("//table[@class=\"table-display\"]//th")).size();
		System.out.println("Row=" +row + "and col=" +col);
		
		// if course name is python the price should be 25.
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000);");
		
		driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();
		boolean boxhide=driver.findElement(By.xpath("//input[@id=\"displayed-text\"]")).isDisplayed();
		System.out.println("Is textbox display" + boxhide);
		Assert.assertEquals(false, boxhide);
		driver.findElement(By.xpath("//input[@id=\"show-textbox\"]")).click();
		boolean boxdisplay=driver.findElement(By.xpath("//input[@id=\"displayed-text\"]")).isDisplayed();
		System.out.println("Is textbox display" + boxdisplay);
		Assert.assertEquals(true, boxdisplay);
		
		
		WebElement mouse=driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
		
		WebElement mouseclick=driver.findElement(By.xpath("//a [text()=\"Reload\"]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(mouse).moveToElement(mouse).moveToElement(mouseclick).click().perform();
		Thread.sleep(5000);
		
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=\"Courses\"])[1]")).click();
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//legend[text()=\"iFrame Example\"]")).getText();
		System.out.println(text);
		driver.quit();
		

	}

}
