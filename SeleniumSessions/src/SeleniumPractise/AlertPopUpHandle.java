package SeleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	
	// to handle the alert popup we use Alert API
	// Alert class available in the selenium 
	// we use switchTo();, alert(); method to go on the alert popup window
	// we create Alert class reference name alert 
	// with the help of reference with use getText(); to get text from pop up window
	// we use another method alert.accept(); to click on ok button 
	// if we want to cancel we use alert.dismiss(); method 
			
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome

        driver.get("https://mail.rediff.com");// Enter the  URL
        
        driver.findElement(By.linkText("Sign in")).click();// click on Signin 
        
        driver.findElement(By.name("proceed")).click();// click on Signin Button
        
        Thread.sleep(5000); // wait time to switch to window
        
        Alert alert = driver.switchTo().alert();// window switch with Alert API
        
        System.out.println(alert.getText());// print text from window
        
        String text = alert.getText();// window text will give String 
        
        if(text.equals("Please enter a valid user name")) {// validate the text from the window
        	System.out.println("correct alert msg");
        }else {
        	System.out.println("in-correct alert msg");
        }
        alert.accept();// click on 'ok' button


	}

}
