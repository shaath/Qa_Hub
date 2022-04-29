package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String name = links.get(i).getText();
			System.out.println(name);

			links.get(i).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D:\\QAHub_Training\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\screenshots\\"+name+".png"));
				
			driver.navigate().back();
			Thread.sleep(3000);
			links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		}

	}

}
