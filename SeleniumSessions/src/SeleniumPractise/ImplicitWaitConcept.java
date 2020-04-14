package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		// Implicit wait - dynamic wait
		// e commerce Website , where lots of images, contents, taking time load the full page 
		// for all the webElement
		//Global wait 
		// Thread.sleep (static wait) is a hard wait
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://demo.nopcommerce.com");// Enter the URL
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// page load wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		



	}

}
