package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		
		// Headless chrome
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("window-size=1400,800");// if application compatible to mobile then no need addArguments window size
		// options.addArguments("headless");
		//	WebDriver driver=new ChromeDriver(options):
		// it's good when continuous integration , testing very fast
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("window-size=1400,800");
		
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// Enter the URL
		
		System.out.println("Login page title ===" + driver.getTitle()); // get title of the page before login
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin"); //enter the  user name 
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// enter the password
		
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();// click on login button
		
		System.out.println("home page title  ===" + driver.getTitle()); // get title of the page after login



	}

}
