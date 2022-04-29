package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement drop = driver.findElement(By.id("drlist"));
		
		Select s = new Select(drop);
		
//		s.selectByIndex(4);
//		s.selectByValue("Krish");
//		s.selectByVisibleText("ameerpet");
		
		List<WebElement> dItems = s.getOptions();
		System.out.println(dItems.size());
		
		for (int i = 0; i < dItems.size(); i++) {
			
//			s.selectByIndex(i);
			
			String brName = dItems.get(i).getText();
			System.out.println(brName);
			
			if (!brName.equals("")) {
				s.selectByVisibleText(brName);
			}
			
		}
		
	}

}
