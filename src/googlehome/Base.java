package googlehome;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public WebDriver getdriver() throws IOException {
		String filepath="C:\\Users\\Administrator\\eclipse-workspace\\SeleniumGoogle\\src\\data.properties";
		FileInputStream fis=new FileInputStream(filepath); 
		Properties ps=new Properties();
		ps.load(fis);
		if(ps.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions s=new ChromeOptions();
			s.addArguments("--disable-notifications");
			driver=new ChromeDriver(s);
		}
		else if(ps.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Administrator\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		return driver;
	
	
	}


}
