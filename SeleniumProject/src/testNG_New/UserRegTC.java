package testNG_New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegTC extends TestNGMaster{

	@Test
	public void orgUserReg() throws InterruptedException
	{
		boolean flag = false;
		expval = uname;
		gm.driver.findElement(By.linkText("Admin")).click();
		gm.driver.findElement(By.linkText("User Management")).click();
		gm.driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(3000);
		gm.driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		gm.driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		gm.driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		gm.driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		gm.driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		gm.driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows = gm.driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			actval = cols.get(1).getText();
			if (actval.equalsIgnoreCase(expval)) {
				flag = true;
				break;
			}
		}
		
		Assert.assertEquals(flag, true);
		
	}
}
