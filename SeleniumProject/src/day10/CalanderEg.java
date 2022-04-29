package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "22/June/2022";
		
		String[] split = date.split("/");
		
		String day = split[0];
		String month_year = split[1]+" "+split[2];
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("(//*[local-name()='svg' and @class='t-all ml-2'])[1]")).click();
		
		Thread.sleep(3000);
		
		String act_mon_year = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(act_mon_year);
		
		while (!month_year.equalsIgnoreCase(act_mon_year)) {
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			act_mon_year = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']/div")).getText();		
		}
		
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']"));
		
		for(int i = 0; i < days.size(); i++)
		{
			String name = days.get(i).getAttribute("aria-label");
			System.out.println(name);
			
			if (name.contains(" "+day+" "))
			{
				 days.get(i).click();
				 break;
			}
		}
		
	}

}
