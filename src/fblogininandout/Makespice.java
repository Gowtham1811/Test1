package fblogininandout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import googlehome.Base;

public class Makespice extends Base {
	public WebDriver driver;
	public ChromeOptions s;
	
	public void ms() throws IOException {
		WebDriver driver=getdriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement from=driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(from).clickAndHold().build().perform();
		//driver.quit();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Makespice mk=new Makespice();
		mk.ms();

	}

}
