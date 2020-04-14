package SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	// we will right the code to read the prop file
	// we have to create the object of properties class
	// we have to create an object of FileInputStream class
	// and in FileInputStream class object we have to put config.properties file path
	// basically FileInputStream class making a connection between java code and config.properties file
	// now we have to load properties by using Properties class method using object prop.load
	// now we need to read the properties file we have to use method: prop.getProperty("pass the key from config file");
	// if wrong key entered or it's commented it's display null in console
	// to comment property file : #
	// we can able to create data driven framework
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();// 
		
		FileInputStream fip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumPractise\\config.properties");
		
		prop.load(fip);//
		
		System.out.println(prop.getProperty("name"));// Ram
		
		System.out.println(prop.getProperty("age"));// 25
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");

		 driver = new ChromeDriver(); //launch Chrome
		}
		else if (browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		}
			
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("register_xpath"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName"));
		}
		

		

	}


