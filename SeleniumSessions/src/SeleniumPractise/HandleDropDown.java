package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		// for handle drop box we import Select class from selenium and create an object
		// in object we pass value : Select select = new Select(driver.findElement(By.name("DateOfBirthDay")))
		// we take a locator of drop box where we need enter the value
		// we use Select class method : selectByVisibleText(); to enter the data in String
		//select.selectByVisibleText("5");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome

	    driver.get("https://demo.nopcommerce.com");// enter URL
	    
	    driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click(); // click on Register (1.locator By.xpath),relative xpath

	    Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));// use Select class and his method
	    select.selectByVisibleText("5");

	}

}
