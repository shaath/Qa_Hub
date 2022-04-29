package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessMethodsEg extends GenericMethodEg{

	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	//Launch
	public String orgLaunch(String br, String url) throws IOException
	{
		fi = new FileInputStream("D:\\QAHub_Training\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties");
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		brLaunch(br);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String orgLogin(String u, String p) throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(3000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Logout
	public String orgLogout() throws InterruptedException
	{
		expval = "LOGIN";
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void orgClose()
	{
		driver.quit();
	}
	
	//Employee registration
	public String orgEmpReg(String f, String l, String eid)
	{
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		if (expval.equalsIgnoreCase(actval)){
			return "Pass";
		}else{
			return "Fail";
		}
	}

	//User Registration
	public String orguserReg(String ename, String uname, String pwd) throws InterruptedException
	{
		expval = uname;
		boolean flag = false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> usernae = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
		
		for (int i = 0; i < usernae.size(); i++) 
		{
			actval = usernae.get(i).getText();
			if (expval.equalsIgnoreCase(actval)) 
			{
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			return "Pass";
		}else{
			return "Fail";
		}
		
	}
	
}
