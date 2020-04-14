package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe\\");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");
		
		// Launch Firefox:
		//Firefox Driver is a class in Selenium
		// gecko driver is a class in selenium
		// object of Firefox Driver class and  WebDriver is a interface, driver is a object reference ,here dynamic polymorphism 
		//in System.setProperty we have to set Property and give a path of gecko driver's exe file 
		// very carefully use backward or forward slash correctly, double quote
		
		//Launch Firefox Browser
		
		// set system property and give a driver complete path
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe\\");
		
		// launch firefox 
		//WebDriver driver = new FirefoxDriver();
		
		//Launch  Chrome Browser

		// set system property and give a driver complete path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");
		
		// Launch ChromeBrowser
		WebDriver driver = new ChromeDriver();

		//use driver object and use different methods like get

	//	driver.get("https://opensource-demo.orangehrmlive.com/");// Enter the URL
		
		driver.get("https://www.google.com/"); // launch google.com
		
		String title = driver.getTitle(); // get title return String 
		
		System.out.println(title);// Google 
		
		if(title.equals("Google")) {// verify the title with if else statement
			System.out.println("Title is correct");
		}else{
			System.out.println("Title is in-correct");
		}
		
		System.out.println(driver.getCurrentUrl()); // print the current url
		
		//System.out.println(driver.getPageSource()); // get the HTML google page source
		
		driver.quit(); // just quit the current window so close current window
		//driver.close(); // close the browser
		
	}

}