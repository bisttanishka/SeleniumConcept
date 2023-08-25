package RahulShettyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OptimizedTable {
	
	 private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testBookInfo() {
	        String bookName = "WebSecurity Testing for Beginners-QA knowledge to next level";
	        String[] info = getBookInfo(bookName);

	        if (info != null) {
	            System.out.println("Instructor: " + info[0]);
	            System.out.println("Price: " + info[2]);
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    @Test
	    public void testPersonInfo() {
	        String personName = "Dwayne";
	        String[] personInfo = personInfo(personName);

	        if (personInfo != null) {
	            System.out.println("Name: " + personInfo[0]);
	            System.out.println("Position: " + personInfo[1]);
	            System.out.println("City: " + personInfo[2]);
	            System.out.println("Amount: " + personInfo[3]);
	        } else {
	            System.out.println("Person Info not found.");
	        }
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }

	    private String[] getRowInfo(String itemName, int numColumns) {
	        try {
	            WebElement row = driver.findElement(By.xpath("//td[contains(text(), '" + itemName + "')]/ancestor::tr"));

	            if (row != null) {
	                String[] rowData = new String[numColumns];
	                for (int i = 0; i < numColumns; i++) {
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

	    private String[] getBookInfo(String bookName) {
	        return getRowInfo(bookName,3);
	    }

	    private String[] personInfo(String personName) {
	        return getRowInfo(personName,4);
	    }
	}



