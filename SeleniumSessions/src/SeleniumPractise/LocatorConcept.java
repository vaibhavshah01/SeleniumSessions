package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome

	    driver.get("https://demo.nopcommerce.com");// enter URL
	    
	    driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click(); // click on Register (1.locator By.xpath),relative xpath
	    
	    driver.findElement(By.cssSelector("#gender-male")).click();// click on Gender (2.locator By.cssSelector)
	   
	    driver.findElement(By.id("FirstName")).sendKeys("Ram");// Enter First Name (3.locator By.id)
	    
	    driver.findElement(By.name("LastName")).sendKeys("Shah");// Enter Last Name (4.locator By.name)
	    
	    //   driver.findElement(By.linkText("sign in")).click();//(for click on links <a tag) (5.locator By.linktext)

       // CSSselector(inspect--><input tag--> right click-->copy-->selector)
	    
      // to create cssSelector 
	  // if id is there-- #{id}
	  //if class is there -- .{class}  
	    
	  // xpath
	  //1. absolute xpath
	  //2. relative xpath
	    
        Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));// Enter Date of Birth
        select.selectByVisibleText("1");
       
        Select select1=new Select(driver.findElement(By.name("DateOfBirthMonth")));// Enter Birth of month
        select1.selectByVisibleText("March");
       
        Select select2=new Select(driver.findElement(By.name("DateOfBirthYear")));// Enter Birth of Year
        select2.selectByVisibleText("1910");
        //Enter Email
      //  driver.findElement(By.name("Email")).sendKeys("testtest1" + randomDate() + "@test.com");
        
        driver.findElement(By.name("Company")).sendKeys("Abc ltd");// Enter company name
        
        driver.findElement(By.name("Newsletter")).submit();// click on News letter
       
        driver.findElement(By.id("Password")).sendKeys("L1234567");// Enter the password
        
        driver.findElement(By.id("ConfirmPassword")).sendKeys("L1234567");// Enter the confirm password
        
        driver.findElement(By.id("register-button")).click();// click on Register Button 
        
        driver.findElement(By.name("register-continue")).click();// click on continue
        
	  //  driver.quit();
	}

	//private static String randomDate() {
		// TODO Auto-generated method stub
		//return null;
	}

//}
