package MyPracticeSelenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapConcept {
	
	static HashMap<String,String>loginmethod(){
		
	//Create HasMap to store data
			HashMap<String,String> map=new HashMap<>();
		//add Key-value pair to hasmap
			
			map.put("x", "mercury@mercury"); //x is the username and values contain username and password
			map.put("y", "mercury1@mercury1");
			map.put("z", "mercury@mercury");
			//Remove an item
			//System.out.println(map.remove("y"));
			//to access an item
			//System.out.println(map);
			
			//to get value from key
			//map.get("x");->it will returrn value of key
			
			//foreach to print
			for(String i:map.keySet()) {
			System.out.println("key:" + i + "value:" + map.get(i));
				
			}
			return map;
			
			
}
			

	public static void main(String[] args) {
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		//login x
		String credentail=loginmethod().get("x");
		String arr[]=credentail.split("@");
		
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		driver.findElement(By.name("submit")).click();
		

	
	

	}

}
