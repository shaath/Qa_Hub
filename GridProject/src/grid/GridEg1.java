package grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg1 {

	@Parameters({"Browser", "Plotform"})
	@Test
	public void grid(String br, String pt) throws MalformedURLException, InterruptedException
	{
		System.out.println(br+"---"+pt);
		DesiredCapabilities cap = null;
		if (br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("windows"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("windows")) {
			cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.8:4444/wd/hub"), cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}
}
