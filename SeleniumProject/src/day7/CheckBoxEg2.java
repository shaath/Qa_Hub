package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> checks = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input"));
		
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) {
			String cName = checks.get(i).getAttribute("value");
			System.out.println(cName);
			
			if (!checks.get(i).isSelected())
			{
				checks.get(i).click();
			}
		}		
	}

}
