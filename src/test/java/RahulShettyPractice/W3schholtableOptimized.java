package RahulShettyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schholtableOptimized {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();

        String companyName = "Ernst Handel";
        String[] info=getCompanyDetails(companyName);
       // String[] info = getCompanyInfo(companyName,3); //-> if you dont' want to use private method then use this directly
        if (info != null) {
            String company = info[0];
            String contract = info[1];
            String country = info[2];

            System.out.println("Company: " + company);
            System.out.println("Contract: " + contract);
            System.out.println("Country: " + country);
        } else {
            System.out.println("Company not found");
        }

        driver.quit();
    }

    public static String[] getCompanyInfo(String itemname, int column) {
        try {
            WebElement row = driver.findElement(By.xpath("//td[contains(text(), '"+ itemname + "')]/ancestor::tr"));
            if (row != null) {
                String[] rowData = new String[column];
                for (int i = 0; i < column; i++) {
                    rowData[i] = row.findElement(By.xpath("./td[" + (i + 1) + "]")).getText();
                }
                return rowData;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

   private static String[] getCompanyDetails(String companyname) {
        return getCompanyInfo(companyname, 3);
    }
}
