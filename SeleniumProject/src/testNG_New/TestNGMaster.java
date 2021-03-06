package testNG_New;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import methods.GenericMethodEg;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestNGMaster {
	public String url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String prPath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties";
	public String expval, actval;
	public GenericMethodEg gm;
	public FileInputStream fi;
	public Properties pr;
	public String br = "firefox";
	public String fname = "Sri", lname = "Manasa", eid = "SM6454678";
	public String uname = "AA"+fname+lname+"324", ename = fname+" "+lname, pwd = "Test@0987612345sp"; 
	
	@BeforeTest
	public void orgLaunch() throws IOException
	{
		fi = new FileInputStream(prPath);
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		
		gm = new GenericMethodEg();
		gm.brLaunch(br);
		gm.driver.get(url);
		gm.driver.manage().window().maximize();
		gm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		actval = gm.driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeClass
	public void orgLogin()
	{
		expval = "welcome";
		gm.driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		gm.driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		gm.driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = gm.driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterClass
	public void orgLogout() throws InterruptedException
	{
		expval = "LOGIN";
		Thread.sleep(3000);
		gm.driver.findElement(By.partialLinkText("Welcome")).click();
		gm.driver.findElement(By.linkText("Logout")).click();
		
		actval = gm.driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterTest
	public void orgClose()
	{
		gm.driver.close();
	}
}
