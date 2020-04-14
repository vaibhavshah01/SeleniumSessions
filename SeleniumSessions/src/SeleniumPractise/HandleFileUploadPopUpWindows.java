package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUpWindows {
	
	// windows file upload pop up handle 
	// we need to find locator ( // driver.findElement) for browse or choose file
	// most of the time we can see in locator type="file"
	// then instead of click we use sendKeys(// file path address ); and inside we give path address of file

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		WebDriver driver=new ChromeDriver(); //launch Chrome
		
		driver.get("https://html.com/input-type-file/");// Enter the URL
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\User\\Desktop\\testpage.docx");// upload the file


	}

}
