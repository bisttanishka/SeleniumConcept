package RahulShettyPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulTablePractice {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//String[] name={"Alex", "Ben", "Dwayne", "Ivory", "Jack", "Joe", "Raymond", "Ronaldo", "Smith"};
		List<String> name = new ArrayList<>();
        name.add("Alex");
        name.add("Ben");
        name.add("Dwayne");
        name.add("Ivory");
        name.add("Jack");
        name.add("Joe");
        name.add("Raymond");
        name.add("Ronaldo");
        name.add("Smith");
		int total=0;
		for(String names:name) {
List<String> info = getTableTotal(names,4);

		if (info != null) {
			
			String amount= info.get(3);
			total=total+Integer.parseInt(amount);

			
		} else {
			System.out.println("Name not found");
		}
		
		}
		 System.out.println("Total Amount Collected: " + total);
		 driver.quit();
	}
	
	 
	public static List<String> getTableTotal(String itemname, int column) {
        try {
            WebElement row = driver.findElement(By.xpath("//td[contains(text(), '"+ itemname + "')]/ancestor::tr"));
            if (row != null) {
            	
                List<String> rowData = new ArrayList(column);
                for (int i = 0; i < column; i++) {
                    rowData.add(row.findElement(By.xpath("./td[" + (i + 1) + "]")).getText());
                }
                return rowData;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }


}

