package testNG_New;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTC extends TestNGMaster{

	@Test(dataProvider = "data")
	public void orgEmpreg(String fname, String lname, String eid)
	{
		expval = fname+" "+lname;
		gm.driver.findElement(By.linkText("PIM")).click();
		gm.driver.findElement(By.linkText("Add Employee")).click();
		
		gm.driver.findElement(By.id("firstName")).sendKeys(fname);
		gm.driver.findElement(By.id("lastName")).sendKeys(lname);
		gm.driver.findElement(By.id("employeeId")).clear();
		gm.driver.findElement(By.id("employeeId")).sendKeys(eid);
		gm.driver.findElement(By.id("btnSave")).click();
		
		actval = gm.driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public String[][] data(){
		String[][] x = new String[4][3];
		
		x[0][0] = "Srikanth";
		x[0][1] = "U";
		x[0][2] = "SU78543";
		
		x[1][0] = "Kiran";
		x[1][1] = "H";
		x[1][2] = "KH78543";
		
		x[2][0] = "Spandana";
		x[2][1] = "K";
		x[2][2] = "SK78543";
		
		x[3][0] = "Prashanth";
		x[3][1] = "B";
		x[3][2] = "PB78543";
		
		return x;
	}
}
