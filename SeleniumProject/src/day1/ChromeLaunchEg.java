package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\QAHub_Training\\Jars/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
	}

}
