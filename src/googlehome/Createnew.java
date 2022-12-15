package googlehome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createnew {
	
	public void cnew() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		/*WebElement username=driver.findElement(By.cssSelector("input[name='username']"));
		username.sendKeys("7358433890");
		WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("Perumal20");
		WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();*/
		WebElement loginfb=driver.findElement(By.cssSelector("span[class='KPnG0']"));
		loginfb.click();
		WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
		username.sendKeys("suriyaperumals@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[name='pass']"));
		password.sendKeys("jackpeter");
		WebElement loginfbc=driver.findElement(By.cssSelector("button[name='login']"));
		loginfbc.click();
		driver.quit();
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Createnew cnew =new Createnew();
		cnew.cnew();
		

	}

}
