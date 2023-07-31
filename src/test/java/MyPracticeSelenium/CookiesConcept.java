package MyPracticeSelenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesConcept {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");

//How to capture cookies from browser

Set<Cookie> cookies=driver.manage().getCookies();
System.out.println("Size of cookies"+cookies.size());

//How to print cookies namw and value
for(Cookie cookie:cookies) {
	
System.out.println(cookie.getName()+":"+cookie.getValue());
}

System.out.println("=======================================================================");
//How to add cookie to the browser
Cookie cookieobj=new Cookie("Mynewcookies","070934");
driver.manage().addCookie(cookieobj);
cookies=driver.manage().getCookies();
System.out.println(cookies.size());
for(Cookie cookieadd:cookies) {
	System.out.println(cookieadd.getName()+":"+cookieadd.getValue());
}

//How to delete specific cookie from browser
driver.manage().deleteCookie(cookieobj);

//driver.manage().deleteCookieNamed("Mynewcookies");
cookies=driver.manage().getCookies();
System.out.println(cookies.size());

//How to delete all the cookies from browser
driver.manage().deleteAllCookies();
cookies=driver.manage().getCookies();
System.out.println(cookies.size());

driver.quit();
}
}