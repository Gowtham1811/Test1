package googlehome;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fbinout extends Base{
	public void fin() throws IOException {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(s);
		 */
		WebDriver driver=getdriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement lang=driver.findElement(By.cssSelector("a[title='English (UK)']"));
		lang.click();
		WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
		username.sendKeys("suriyaperumals@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
		password.sendKeys("jackpeter");
		WebElement login=driver.findElement(By.cssSelector("button[name='login']"));
		login.click();
			}
	public void fout()
	{
		WebElement acc=driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img']//parent::div)[4]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(acc).click().perform();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement lout=driver.findElement(By.xpath("(//span[@dir='auto']//parent::div)[8]"));
		lout.click();
		//driver.close();
		driver.quit();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fbinout fin=new Fbinout();
		fin.fin();
		fin.fout();

	}

}
