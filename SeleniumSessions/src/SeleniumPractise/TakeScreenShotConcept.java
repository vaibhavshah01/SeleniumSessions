package SeleniumPractise;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {
	
	// to take Screenshot we use method: getScreenshotAs
	// we use interface : TakesScreenshot
	 //org.apache.commons.io.FileUtils; ( we need to download this to run the script)
	
	// take screenshot and store as a file format;
	//	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	// now copy the screenshot to desired location using copyFile // method
	//	FileUtils.copyFiles(src.new File("C:\\Users\\User\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumPractise\\google.jpg"));

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://demo.nopcommerce.com");// Enter the URL
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// page load wait
	
	
		}

}
