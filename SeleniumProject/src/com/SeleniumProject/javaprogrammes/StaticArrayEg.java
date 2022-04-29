package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[]  salary = {10000, 20000, 30000, 200000, 50000, 60000, 70000, 80000, 90000};
		
		System.out.println(salary.length);
		
//		System.out.println(salary[2]);
		
//		for (int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for(int data: salary)
		{
			System.out.println(data);
		}
	}

}
