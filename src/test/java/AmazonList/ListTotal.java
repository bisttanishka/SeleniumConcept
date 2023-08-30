package AmazonList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListTotal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("7300584041");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Oracle@0709");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@href=\"https://www.amazon.in/gp/cart/view.html?ref_=nav_cart\"]")).click();
		// wait.until(ExpectedConditions.urlContains("/gp/cart"));
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='a-price-symbol'
		// and text()='₹']/following-sibling::span[@class='a-offscreen']")));

		double calculatedTotal = calculateCartTotal(driver);
		double displayedTotal = getDisplayedTotal(driver);

		System.out.println("Calculated Total: ₹" + calculatedTotal);
		System.out.println("Displayed Total: ₹" + displayedTotal);

		if (calculatedTotal == displayedTotal) {
			System.out.println("Total amount validated successfully.");
		} else {
			System.out.println("Total amount validation failed.");
		}

	}

	public static double calculateCartTotal(WebDriver driver) {

		System.out.println("Inside");

		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class=\"sc-item-price-block-badge\"]//span[@class=\"currencyINR\"]/ancestor::span"));
		System.out.println("Size of the Element" + priceElements.size());
		double total = 0.0;
		for (WebElement priceElement : priceElements) {
			String priceText = priceElement.getText().replace("₹", "").replace(",", "");
			System.out.println("Text display" + priceText);
			double price = Double.parseDouble(priceText);
			System.out.println(price);
			total += price;

		}
		return total;

	}

	public static double getDisplayedTotal(WebDriver driver) {

		WebElement displayedTotalElement = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']"));
		String displayedTotalText = displayedTotalElement.getText().replace("₹", "").replace(",", ""); // Remove comma
																										// separators if
																										// present
		return Double.parseDouble(displayedTotalText);
	}
}
