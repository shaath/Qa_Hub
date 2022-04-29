package com.SeleniumProject.javaprogrammes;

public class PolindromeStringEg {

	public static void main(String[] args) {
		
		String course = "malayalam";
		String course_rev = "";
		
		int len = course.length();
		
		for (int i = len - 1; i >= 0; i--)
		{
//			System.out.println(course.charAt(i));
			course_rev = course_rev + course.charAt(i);		//---->   muineleS
		}

		System.out.println(course_rev);
		
		if (course.equals(course_rev)) {
			System.out.println("Given String is a polindrome");
		}
		else{
			System.out.println("Given String is not a polidrome");
		}
	}

}
