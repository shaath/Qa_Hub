package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFLaunchEg {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "D:\\QAHub_Training\\Jars/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
	}

}
