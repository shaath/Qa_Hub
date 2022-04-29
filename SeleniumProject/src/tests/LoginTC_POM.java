package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.AdminHomePage;
import pom.LoginPage;

public class LoginTC_POM {

	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.login(lp.u, lp.p);
		
		Thread.sleep(3000);
		
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}
}
