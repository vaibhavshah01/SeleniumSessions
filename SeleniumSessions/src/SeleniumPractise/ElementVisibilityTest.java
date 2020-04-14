package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		//difference between -- isDisplayed() v/s isEnabled() v/s isSelected() 
		//very useful for validation like button, logo, specific element , UI testing , GUI testing point of view
		// isDisplayed() : 
		// applicable for all the element
		// particular element displayed or not
		//it return boolean value:  it return true if it's displayed and false if not displayed
		// visibility test for button , logo 
		// isEnabled():
		// it's return boolean value : true or false
		// checkbox, ex. I agree terms and agreement select the checkbox then it's enable
		// isSelected():
		// only applicable for checkbox , dropdown, radio button
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// Enter the URL
		
		//1. isDisplayed() // for all the element
		
		boolean b1 = driver.findElement(By.xpath("//input[@name=\"Submit\"]")).isDisplayed(); //login button visibility test
		
		System.out.println(b1); // true
		
		// isEnabled() 
		
		boolean b2 = driver.findElement(By.xpath("//input[@name=\"Submit\"]")).isEnabled(); //login button visibility test
		
		System.out.println(b1); // false
		
		
		// isSelected() 
		
		boolean b3 = driver.findElement(By.xpath("//input[@name=\"Submit\"]")).isSelected(); //login button visibility test
		
		System.out.println(b1); // false
		
		

		
		

	}

}
