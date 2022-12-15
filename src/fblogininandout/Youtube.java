package fblogininandout;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {
	public void ytb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	
		WebElement search = driver.findElement(By.xpath("//input[@autocorrect='off']"));
		Actions ac=new Actions(driver);
		search.sendKeys("selenium");
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		ac.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[contains(@aria-label,'12 Hours')]")))
		.click().keyUp(Keys.CONTROL).perform();
	}

	public void keyboard() {
		try {
			Robot rs=new Robot();
			rs.keyPress(KeyEvent.VK_ENTER);
			rs.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Youtube yt=new Youtube();
		yt.ytb();
		//yt.keyboard();

	}

}
