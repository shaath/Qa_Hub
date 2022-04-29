package testNG_New;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsEg {

	@Test(priority=0)
	public void Function1()
	{
		System.out.println("This is TestNG Function1 code");
	}
	
	@Test(priority=1)
	public void Function2()
	{
		System.out.println("This is TestNG Functon2 code");
	}
	
	@Test(priority=2)
	public void Function3()
	{
		System.out.println("This is TestNG Function3 code");
//		throw new SkipException("This annotation related code not yet implemented");
	}
	
	@Test(priority=3)
	public void Apple()
	{
		System.out.println("This is TestNG Apple Code");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test");
	}
}
