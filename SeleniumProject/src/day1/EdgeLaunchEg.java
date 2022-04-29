package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\QAHub_Training\\Jars\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

//		driver.get("https://selenium.dev");
//		driver.manage().window().maximize();
				
//		System.setProperty("webdriver.opera.driver", "");
//		WebDriverManager.operadriver().setup();
//		WebDriver driver = new OperaDriver();
			
//		System.setProperty("webdriver.safari.driver", "");
//		WebDriver driver = new SafariDriver();
		
	}

}
