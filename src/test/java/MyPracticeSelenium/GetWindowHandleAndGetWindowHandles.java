package MyPracticeSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandleAndGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//1 getWindowHandle()->it will give ID for single window
		
		//String windowID=driver.getWindowHandle();
		//System.out.println("Single window ID"+windowID);
		
		//2 How to get multiple browser window ID
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		Set<String> allWindowId=driver.getWindowHandles();//it return set of string.
		//Now we need to retrive the data from set of string.
		
		//**First Method by using Iterator
		
		/*Iterator<String> it=allWindowId.iterator();
		String parentwindowid = it.next();
		String childwindowid =it.next();
		
		System.out.println("Parent Window Id"+parentwindowid);
		System.out.println("child Window Id"+childwindowid);*/
		
		//***Second method convert set into list and pass variable into Arraylist
		
	/*List<String> windowIdList= new ArrayList(allWindowId);
		
	String parentwindowid=windowIdList.get(0);
	String childwindowid=windowIdList.get(1);	
	
	System.out.println("Parent Window Id"+parentwindowid);
	System.out.println("child Window Id"+childwindowid);
		
	//Now Switch to child window by using windowIDs
	
	driver.switchTo().window(parentwindowid);
	System.out.println("Title of parentwindow" +driver.getTitle());
	
	driver.switchTo().window(childwindowid);
	System.out.println("Title of childwindow" + driver.getTitle());*/
	
	//********************Now if don't want to write such a lengthy code we can use for each loop********************
	
	List<String> windowIdList=new ArrayList(allWindowId);
	for(String windowID:windowIdList) {
        		
		String title=driver.switchTo().window(windowID).getTitle();
		System.out.println(title);
		
		if(title.equals("OrangeHRM")) {//As soon as it click to child window the parent window will close
			
			driver.close();
			
		}
	}
	
	
	
	
		
		

	}

}
