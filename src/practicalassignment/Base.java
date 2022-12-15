package practicalassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static WebDriver getdriver() throws IOException {
		String filepath="C:\\Users\\gowtham\\Documents\\Selenium\\SeleniumGoogle\\src\\practicalassignment\\chrome.properties";
		FileInputStream file=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(file);
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gowtham\\Documents\\Selenium\\chromedriver.exe");
			ChromeOptions s=new ChromeOptions();
			s.addArguments("--disable-notifications");
			driver=new ChromeDriver(s);
			driver.manage().window().maximize();
			//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
		}
		return driver;			
	}
	
	public static WebElement WaitforElementVisisble(WebElement Element,int waittime) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, waittime);
			wait.until(ExpectedConditions.visibilityOf(Element));
			return Element;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void ClickElement(WebElement Element,int waittime) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, waittime);
			wait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.click();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public static List<WebElement> FindElements(By Element) {
		List<WebElement> ListElement=driver.findElements(Element);
		return ListElement;
	}
	
	public static  WebElement FindElement(By Element) {
		WebElement Ele=driver.findElement(Element);
		return Ele;
	}
	
	
	

}
