package googlehome;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin extends Base{
	public WebDriver driver;
	
	public void ff() throws IOException
	{
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		//driver.get("https://www.gmail.com");
		facebooklogin fl = new facebooklogin();
		WebDriver driver=getdriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afe_wPu3fodHLYyzahBOhgfBO00ExYZFfg8458UJiXq3RoJD9OhUZVx5xzPDyu3py-ZmAlGKmeavkOZJ4GM56joRSPk4onR1luG-mh2VtT6BzQ&smuh=34575&lh=Ac-LDFhYVmjGYDx7TSc");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		driver.manage().window().maximize();
		/*WebElement Username=driver.findElement(By.id("email"));
		Username.sendKeys("suriyaperumals@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("jackpeter");
		WebElement login=driver.findElement(By.name("login"));
	    login.click();*/
		WebElement eng=driver.findElement(By.cssSelector("a[title='English (UK)']"));
		eng.click();
		WebElement create=driver.findElement(By.cssSelector("a[rel='async']"));
		create.click();
		WebElement datedrop=driver.findElement(By.cssSelector("select[title='Day']"));
		Select date=new Select(datedrop);
		date.selectByIndex(25);
		
		
		
		//driver.close();
		
		//driver.quit();
		
		
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		facebooklogin ff= new facebooklogin();
		//WebDriver driver=ff.getdriver();
    ff.ff();
	}

}
