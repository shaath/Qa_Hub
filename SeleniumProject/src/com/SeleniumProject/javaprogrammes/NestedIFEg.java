package com.SeleniumProject.javaprogrammes;

public class NestedIFEg {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 100;
		int c = 100;
		
		if(a > b & a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > a & b > c) 
		{
			System.out.println("B is Greater");
		}
		else if (c > a & c > b)
		{
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Variable value should not be duplicated");
		}
		
	}

}
