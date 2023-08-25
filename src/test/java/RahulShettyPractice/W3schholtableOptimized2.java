package RahulShettyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schholtableOptimized2 {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        
        List<WebElement> row=driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr"));
        System.out.println(row.size());
        int rowsize = row.size();
        		
        List<WebElement> col=driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr[1]//th"));
        System.out.println(col.size());
        int colsize=col.size();
        
        for (int i = 2; i <= rowsize; i++) {
            for (int j = 1; j <= colsize; j++) {
            	String data=(  driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[" + i + "]/td[" + j + "]")).getText());
                System.out.print(data);
                
               
            }
            System.out.println();
        }
        
        //driver.quit();
    }
}
