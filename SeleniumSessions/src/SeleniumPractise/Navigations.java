package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	
	// navigate().to() use to go external website
	// navigate().back() to come back to 1st url 
	// navigate().forward() to go again to external website

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://demo.nopcommerce.com");// Enter the URL
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// page load wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com");// navigate to another URL // Google
		
		Thread.sleep(2000);// static wait 
		
		driver.navigate().back();// back to nopcommerce
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//forward again to Google
		
		driver.navigate().refresh();// refresh the web page


	}

}
