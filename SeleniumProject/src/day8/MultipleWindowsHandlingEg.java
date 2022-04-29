package day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");

		String gmail_id = driver.getWindowHandle();
//		System.out.println(gmail_id);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(3000);
		Set<String> s = driver.getWindowHandles();
		Thread.sleep(3000);
		
		for (String wid : s) 
		{
			System.out.println(wid);
			
			driver.switchTo().window(wid);
			Thread.sleep(3000);
			String title = driver.getTitle();
			
			if (title.contains("Privacy Policy")) {
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
			
		}
		
		driver.switchTo().window(gmail_id);
		
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://facebook.com");
		
		driver.quit();
	}

}
