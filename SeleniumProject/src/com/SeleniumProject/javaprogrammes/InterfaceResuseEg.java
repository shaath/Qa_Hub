package com.SeleniumProject.javaprogrammes;

public class InterfaceResuseEg {

	public static void main(String[] args) {
		
		InterfaceImplementsEg1 ie1 = new InterfaceImplementsEg1();
		ie1.Vehicle();

		InterfaceEg ie2 = new InterfaceImplementsEg2();
		ie2.Vehicle();
	}

}
