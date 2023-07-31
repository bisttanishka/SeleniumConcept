package MyPracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPractice {

	public static void main(String[] args){
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().window().maximize();
	       TakesScreenshot ts=(TakesScreenshot)driver;
	        File src=ts.getScreenshotAs(OutputType.FILE);
           
	      File trg=new File(System.getProperty("user.dir") + "/src/main/java/screen/homepagelatest1.png");
	//If you have folder inside the project.
	       //File trg=new File(".//ScreenShotFolder//homepage2.png");//// .->represent the current directory of your projectand then giverfoldernamewhere you want to store screenshot along with name of file to be saved with.
	        try {
				FileHandler.copy(src, trg);
				System.out.println("ScreenShot copied"+trg);
			} catch (IOException e) {
				System.out.println("Screenshot not coiped"+e.getMessage());
			}
	        
	   // takeScreenshot(driver,".//ScreenShotFolder//homepage07.png");  
	     
	     //driver.get("https://www.amazon.in");
	     //takeScreenshot(driver,".//ScreenShotFolder//amazonhomepage.png"); 
	     		
	        
	 
	}

	/*public static void takeScreenshot(WebDriver driver,String destinationPath) {
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File(destinationPath);//// .->represent the current directory of your projectand then giverfoldernamewhere you want to store screenshot along with name of file to be saved with.
        try {
			FileHandler.copy(src, trg);
			System.out.println("ScreenShot copied"+trg);
		} catch (IOException e) {
			System.out.println("Screenshot not coiped"+e.getMessage());
		}
}*/
}
