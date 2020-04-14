package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
	
	// Mouse movement Actions Class
	// to do the mouse movement we need to import Actions class from selenium and create an object
	// we use method action.moveToElement(driver.findElement(By.linkText("Computers"))).build().perform();
	// as mouse drop down the menu now we can go on the specific element from sub menu find locator and click on it
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://demo.nopcommerce.com");// Enter the URL
		
		Actions action = new Actions(driver); // import Actions class from selenium and enter in Actions(WebDriver reference)
		
		action.moveToElement(driver.findElement(By.linkText("Computers"))).build().perform();// mouse movement on computers
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Desktops")).click();// click on desktops
		


	}

}
