package MyPracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOption {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		// to print the size of web element and to print the all option
		
		WebElement day=driver.findElement(By.id("day"));
		Select select=new Select(day);
		
		WebElement month=driver.findElement(By.id("month"));
		Select select1=new Select(month);
		
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		
//--------------------------------------------------------------------------	
		List<WebElement> listdays=select.getOptions();
		System.out.println(listdays.size());
		for(int i=0;i<listdays.size();i++) {
			
			String dayval=listdays.get(i).getText();
			System.out.println(dayval);
			
			if(dayval.equals("8")) {
			listdays.get(i).click();
			
			
			}
		}
		
		
//---------------------------------------------------------------------------------------			 
       List<WebElement> msize=select1.getOptions();
      System.out.println("Size of month");
       System.out.println(msize.size());
   System.out.println("Month option");
       for(int k=0;k<msize.size();k++)
       {

    	   String options=select1.getOptions().get(k).getText();
  
    	   System.out.println(options);
    	   if(options.equals("Sep")){
    		msize.get(k).click();
    		break;
    		   
    	   }
    	   
   
       }
 //-----------------------------------------------------------------------      
    List<WebElement> ysize=select2.getOptions();
    System.out.println("Size of year");
    System.out.println(ysize.size());
    
    System.out.println("Print the year options");
    for(int j=0;j<ysize.size();j++) {
    
    String option2=ysize.get(j).getText();
    	System.out.println(option2);
    	if(option2.equals("1999"))
    	{
    		ysize.get(j).click();
    		
    	}
    }
		}
	}


    	
    
    
    
		
	



		
		
	
	

