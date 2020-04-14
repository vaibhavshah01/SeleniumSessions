package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	// frame handling for unable to locate element error or No Such Element Exception ( either xpath wrong or frame inside)
	// find frame in page go in view page source (ctrl + f)
	// we use method driver.switchTo().frame( // name or index no.of frame);
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://www.google.com/"); // launch google.com
		
		driver.switchTo().frame(1);// switch to frame and enter either index number or frame name


	}

}
