package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		// HTML unit driver - used to run script without opening a browser
		// also called headless browser or ghost browser
		// competitor : headless browser  phantom for java script
		// HTML unit driver not available in Selenium 3.x 
		// to use HTML unit driver, we need to download HTML unit driver jar file 
		// advantages : testing happen behind the scene
		// execution of the test cases very fast 
		//performance of the script is very good
		// good for quick sanity and smoke testing
		// we can track the progress on the console by System.out.println()
		//Limitation : not suitable for action class - user action - like mouse movement, double click ,drag and drop
		//	WebDriver driver = new HtmlUnitDriver();// HTML unit driver

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
	//	WebDriver driver = new HtmlUnitDriver();// HTML unit driver
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// Enter the URL
		
		System.out.println("before login, title is ===" + driver.getTitle()); // get title of the page before login
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin"); //enter the  user name 
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// enter the password
		
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();// click on login button
		
		System.out.println("after login, title is ===" + driver.getTitle()); // get title of the page after login

		
		
		


	}

}
