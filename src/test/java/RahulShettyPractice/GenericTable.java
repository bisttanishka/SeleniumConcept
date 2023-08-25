package RahulShettyPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenericTable {

	public static WebDriver driver;

	@Test
	public void launchURL() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
		String bookName = "QA Expert Course :Software Testing + Bugzilla + SQL + Agile";
		String personName1 = "Jack";
		

		String[] info = getBookInfo(bookName);

		if (info != null) {
			String instructor = info[0];
			String book = info[1];
			String price = info[2];

			System.out.println("Instructor: " + instructor);
			System.out.println("Price: " + price);
			System.out.println("Book: " + book);
		} else {
			System.out.println("Book not found.");
		}
	
		List<String> personinfo = getPersonInfoList(personName1);
		

		if (info != null) {
			String name = personinfo.get(0);
			String position = personinfo.get(1);
			String city = personinfo.get(2);
			String amount= personinfo.get(3);

			System.out.println("name " + name);
			System.out.println("position" + position);
			System.out.println("city " + city);
			System.out.println("amount " + amount);
		} else {
			System.out.println("Book not found.");
		}
		/*String[] personinfo = getPersonInfo(personName);

		if (info != null) {
			String name = personinfo[0];
			String position = personinfo[1];
			String city = personinfo[2];
			String amount= personinfo[3];

			System.out.println("name " + name);
			System.out.println("position" + position);
			System.out.println("city " + city);
			System.out.println("amount " + amount);
		} else {
			System.out.println("Book not found.");
		}*/
	}

	public static String[] getBookInfo(String bookName) {

		try {
			WebElement row = driver.findElement(By.xpath("//td[contains(text(), '" + bookName + "')]/ancestor::tr"));

			if (row != null) {
				String instructor = row.findElement(By.xpath("./td[1]")).getText();
				String bookName1 = row.findElement(By.xpath("./td[2]")).getText();
				String price = row.findElement(By.xpath("./td[3]")).getText();
				return new String[] { instructor, bookName1, price };
			} else {
				return null; // Return null if row is not found
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return null; // Return null in case of an exception
		} finally {
			// driver.quit();
		}

	}

	/*public static String[] getPersonInfo(String personName) {

		try {
			WebElement personRow = driver
					.findElement(By.xpath("//td[contains(text(), '" + personName + "')]/ancestor::tr"));

			if (personRow != null) {
				String name = personRow.findElement(By.xpath("./td[1]")).getText();
				String position = personRow.findElement(By.xpath("./td[2]")).getText();
				String city = personRow.findElement(By.xpath("./td[3]")).getText();
				String amount = personRow.findElement(By.xpath("./td[4]")).getText();
				
			
				return new String[] { name, position, city, amount };
			} else {
				return null; // Return null if row is not found
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return null; // Return null in case of an exception
		} finally {
			// driver.quit();
		}

	}*/
	
	public static List<String> getPersonInfoList(String personName1) {
		
		List<String> list=new ArrayList();
		
 
		try {
			WebElement personRow1 = driver
					.findElement(By.xpath("//td[contains(text(), '" + personName1 + "')]/ancestor::tr"));

			if (personRow1 != null) {
				String name = personRow1.findElement(By.xpath("./td[1]")).getText();
				String position = personRow1.findElement(By.xpath("./td[2]")).getText();
				String city = personRow1.findElement(By.xpath("./td[3]")).getText();
				String amount = personRow1.findElement(By.xpath("./td[4]")).getText();
				
				list.add(name);
				list.add(position);
				list.add(city);
				list.add(amount);
			
				return  list;
			} else {
				return null; // Return null if row is not found
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return null; // Return null in case of an exception
		} finally {
			// driver.quit();
		}

	}


}
