package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Keyboard_Ops {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement images = driver.findElement(By.linkText("Images"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(images).perform();
//		Thread.sleep(5000);
//
//		act.contextClick().perform();

		act.moveToElement(images).contextClick().build().perform();
		
	}

}
