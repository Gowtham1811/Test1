package practicalassignment;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeMyTrip extends Base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=getdriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement LoginBtn = FindElement(By.xpath("//li[@data-cy='account']"));
		ClickElement(LoginBtn, 10);
		WebElement FromCity=FindElement(By.id("fromCity"));
		ClickElement(FromCity, 30);
		List<WebElement> FromCityNames=FindElements(By.xpath("//ul[@role='listbox']//li"));
		for(WebElement CityName : FromCityNames) {
			String City=CityName.getText();
			if(City.contains("Chennai")) {
				ClickElement(CityName, 30);
			}
		}
		

	}

}
