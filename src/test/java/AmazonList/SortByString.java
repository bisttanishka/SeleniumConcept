package AmazonList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortByString {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone 14");
        driver.findElement(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]")).click();
        List<WebElement> iphonelist = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));

        List<String> prices = new ArrayList<>();
        for (WebElement iphones : iphonelist) {
            String priceText = iphones.getText().replace("₹", "").replace(",", "");
            prices.add(priceText);
        }

        //prices.sort(new NumericalStringComparator());
        prices.sort(Collections.reverseOrder(new NumericalStringComparator()));
        System.out.println(prices);

        driver.quit();
    }

    static class NumericalStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
        }
    }
}
