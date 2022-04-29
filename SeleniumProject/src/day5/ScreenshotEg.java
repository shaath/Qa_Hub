package day5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("D:\\QAHub_Training\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\screenshots\\google.png"));
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		File src = gmail.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(path+"\\src\\com\\SeleniumProject\\screenshots\\gmail.jpg"));
		
	}

}
