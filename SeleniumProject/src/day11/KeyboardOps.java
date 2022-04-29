package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		Actions act = new Actions(driver);
		
		act.click(username).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("Admin")).perform();
		Thread.sleep(5000);
		act.doubleClick().perform();
		
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).click().build().perform();
		Thread.sleep(5000);
		WebElement p = driver.findElement(By.id("txtPassword"));
		p.click();
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();	
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_UP).perform();
	}

}
