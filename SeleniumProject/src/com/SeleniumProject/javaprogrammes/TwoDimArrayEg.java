package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] x = new Object[3][2];
		
		System.out.println("Number of Rows "+x.length);
		System.out.println("Number of columns for 0th Indexed row "+x[0].length);

		x[0][1] = "Selenium";
		x[1][0] = "Manual";
		x[0][0] = 200000;
		
//		System.out.println(x[0][1]);
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
