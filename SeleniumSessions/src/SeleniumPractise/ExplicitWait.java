package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	// Explicit wait for specific web element like help button, sign in button, login button
	// also called synchronisation point
	// some time there is time gap for data to load as they coming from data base , 
	// throw exception like element not found exception
	// for explicit wait we need to use standard generic method
	// it works for all links, button,check boxes, radio buttons 
	// simply we have to provide three parameters which driver, what element , how much wait time
	
	/*public static void clickOn (WebDriver driver, WebElement locator, int timeout) {
	new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
	.until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();*/
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// page load wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// global wait
		
		driver.get("https://demo.nopcommerce.com");// Enter the URL
		
		clickOn(driver,driver.findElement(By.linkText("Register")),20);// Explicit wait for Register link
		
	
		
	}
	public static void clickOn (WebDriver driver, WebElement locator, int timeout) {// Explicit wait method
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
