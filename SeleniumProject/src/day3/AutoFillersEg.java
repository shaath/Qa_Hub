package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("SH");
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("search"));
		
		List<WebElement> cities = search.findElements(By.tagName("li"));
		
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++) 
		{
			String cname = cities.get(i).getText();
			System.out.println(cname);
			
			if (cname.equalsIgnoreCase("Shimla"))
			{
				cities.get(i).click();
				break;
			}
		}
	}

}
