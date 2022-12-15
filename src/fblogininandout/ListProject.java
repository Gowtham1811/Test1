package fblogininandout;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListProject {
	public void list(String comparetext) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement fromfield = driver.findElement(By.xpath("(//div[@class='fsw_inner']//child::input)[2]"));
		fromfield.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']//li[1]//div[2]")));
		List<WebElement> fromlist = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		int size = fromlist.size();
		int i = 0;
		// int i=1;
		for (; i <= size;)
		{
			i = i + 1;
			WebElement eachvalue = driver.findElement(By.xpath("//ul[@role='listbox']//li[" + i + "]//div[2]"));
			String eachvalues = eachvalue.getText();
			if (eachvalues.equalsIgnoreCase(comparetext)) {
				wait.until(ExpectedConditions.elementToBeClickable(eachvalue));
				eachvalue.click();
				break;
			}

		}

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ListProject lp = new ListProject();
		lp.list("PNQ");

	}

}
