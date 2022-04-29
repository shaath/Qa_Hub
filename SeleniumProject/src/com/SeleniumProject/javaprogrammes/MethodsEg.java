package com.SeleniumProject.javaprogrammes;

public class MethodsEg {
	
	public static String course = "Selenium";
	
	public static void main(String[] args) {
		
		Function1();
		String res = Function2();
		System.out.println(res);
		System.out.println(course);
		
		MethodsEg me = new MethodsEg();
		me.Function3();

		boolean flag = me.Function4();
		System.out.println(flag);
	}
	
	// Static method without returning any value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//Static Method with returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}

	//Non Static method without returning value
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non Static Method with Returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}

	
	public int sum(int a, int b)
	{	
		int c = a + b;
		return c;
	}
	
	public int sum(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
	
	public double sum(double a , double b)
	{
		double c = a + b;
		return c;
	}
}
