package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		String[] course = new String[5];
		
		// Finding the length of the array
		System.out.println(course.length);
		
		//Writing the data into the array
		course[0] = "Selenium";
		course[2] = "UFT";
		course[0] = "Manual";
 		
		for (String data : course)
		{
			System.out.println(data);
		}

	}

}
