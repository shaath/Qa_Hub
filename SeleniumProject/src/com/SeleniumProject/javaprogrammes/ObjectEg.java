package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium", 200000, 232.212, true, 'R'};
		
		System.out.println(x.length);
		
		for (Object data : x) {
			System.out.println(data);
		}

	}

}
