package SeleniumPractise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	
	// handle window pop up - we use window handler API
	// first we click on the another window by locator
	// then we use getWindowHandles() method which give one Set (collections)Object of String type and object name is handler
	// to get the value from Set object we need iterator as in Set object not stored like index number or name 
	// we use method it.next(); pointing the first value in String ( we called Parent Window id)
	// then with same method it.next(); we get child window id
	// then we switch to child window with the method : driver.switchTo().window(childWindowID)
	// we get a title of child window : driver.gettitle();
	// we close the child window with method: driver.close() // close only current window
	// we switch back to parent window : driver.switchTo().window(parentWindowId)
	//	driver.quit(); // quit close all the open browser

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);// page load wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// global wait
		
		driver.get("https://www.popuptest.com/goodpopups.html");// Enter the URL
		
		driver.findElement(By.xpath("popuptest-3")).click(); // click on webpage link
		
		Thread.sleep(2000);// static wait
		
		Set<String> handler = driver.getWindowHandles();//  to window id stored in Set object
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();// parent window id we get
		
		System.out.println("parent window Id" + parentWindowId);// print parent window id
		
		String childWindowID = it.next();// child window id we get
		
		System.out.println("child window id" + childWindowID);// print child window id
		
		driver.switchTo().window(childWindowID); // we switch to child window
		
		Thread.sleep(2000);// static wait
		
		System.out.println("child window pop up title"+ driver.getTitle());// we get the title of the child window
		
		driver.close();// to close the child window // close will only close the only current window

		driver.switchTo().window(parentWindowId); //switch back to parent window
		
		Thread.sleep(2000);//static wait
		
		System.out.println("parent window pop up title"+ driver.getTitle());// print the parent window title
		
		


	}

}
