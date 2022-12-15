package fblogininandout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickmk {
	public void amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver am=new ChromeDriver();
		am.get("https://www.google.com/");
		am.get("https://www.amazon.in/");
		am.manage().window().maximize();
		WebElement mobile=am.findElement(By.linkText("Mobiles"));
		String text=mobile.getText();
		if(text.equals("Mobiles"))
		{
			System.out.println("The test case is Pass");
		}
		else
		{
			System.out.println("The taet case is Fail");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clickmk amazon=new Clickmk();
		amazon.amazon();

	}

}
