package MyPracticeSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {

	
	public static void drawBorder(WebElement element,WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
public static  String gettitle(WebDriver driver) {
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String title=js.executeScript("return document.title").toString();
	return title;
}

public  static void actionclickReg(WebElement element,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
	
}
public  static void alert(WebDriver driver,String message) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('" + message + "')");
}
public  static void refersh(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("history.go(0)");
}

public  static void scrollPageDown(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
public  static void scrollPageUp(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
}

public  static void scrollPageDownpixel(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,350)");
	
}

public  static void scrollPageUppixel(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-350)");
}	
	public  static void scrollPageElementVisible(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
		
	
}
public  static void zoom(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='20%'");

}

}

