package MyPracticeSelenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadfilefromBrowser {

    public static void main(String[] args) {
 //IN CHROME
       String location = System.getProperty("user.dir")+"\\src\\main\\java\\newdownload";//->inside src/main
      //  String location = System.getProperty("user.dir")+"\\Downloadszipfile";//->inside this folder which is under project
       // String location = System.getProperty("user.dir");//->it will download underproject.

        HashMap preferences = new HashMap();
        preferences.put("profile.default_content_setting.popups", 0);
        preferences.put("download.default_directory", location);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);
      
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/p/page7.html");

        driver.findElement(By.linkText("ZIP file")).click();
        
    }
}
