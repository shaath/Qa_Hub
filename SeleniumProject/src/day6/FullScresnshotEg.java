package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScresnshotEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		Thread.sleep(10000);
		
		File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\QAHub_Training\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\screenshots\\bing_full_page.png"));
		
		
	}

}
