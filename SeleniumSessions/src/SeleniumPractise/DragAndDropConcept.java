package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	// Drag and drop done by Actions class 
	//and if frame available we have to switch in frame by method : switchTo().frame(name or index number of frame)
	// we use method action.clickAndHold(driver.findElement(By.id("draggable"))), to click and hold the target object
	//we use method .moveToElement(driver.findElement(By.id("droppable")))., move to object on the source place
	// then we use release(); , to release the object
	//then as usual in Actions method : build().perform();

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.manage().window().maximize();// maximise window
		
		driver.manage().deleteAllCookies();// delete all the cookies

        driver.get("https://jqueryui.com/droppable/");// enter URL
        
        driver.switchTo().frame(0); // switch to frame 
        
        Actions action = new Actions(driver);
        
        action.clickAndHold(driver.findElement(By.id("draggable")))
        .moveToElement(driver.findElement(By.id("droppable")))
        .release()
        .build()
        .perform();


	}

}
