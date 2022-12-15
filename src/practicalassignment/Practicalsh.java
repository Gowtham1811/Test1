package practicalassignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practicalsh extends Base  {
	
	
	public void Radiobutton() throws IOException {
		
		
		////driver.manage().window().maximize();
		WebElement RadioButton=driver.findElement(By.xpath("//input[@value='radio3']"));
		WaitforElementVisisble(RadioButton, 20);
		ClickElement(RadioButton, 20);
	}
	
	public void classexample() {
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("INDIA");
		
	}
	
	public void dropdown() {
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText("Option2");
		
	}
	
	public void checkbox() {
		
		driver.findElement(By.xpath("//input[@value='option3']")).click();
		
	}
	
	public void switchwindow() {
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		//driver.close();
			
	}

	public void switchtab() { 
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		driver.close();
	}
	
	public void Alert() {
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Perumal");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		driver.switchTo().alert().accept();
		
	}
	
	public void mousehover() {
		
		WebElement mousehover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions ac =new Actions(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.moveToElement(mousehover).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//a[\"top\"])[5]"))).click().perform();
		
		
	}
	
	public void switchtab2() {
		WebElement tab=driver.
				findElement(By.xpath("(//a[\"JMeter\"])[11]"));
		Actions ac =new Actions(driver);
		ac.moveToElement(tab).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		//driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= Base.getdriver();
		Practicalsh prac=new Practicalsh();
		prac.Radiobutton();
		prac.classexample();
		prac.dropdown();
		prac.checkbox();
		//prac.switchwindow();
		//prac.switchtab();
		prac.Alert();
		prac.mousehover();
		prac.switchtab2();
		

	}

}
