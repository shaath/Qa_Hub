package com.SeleniumProject.javaprogrammes;

public class InheritanceEg extends MethodsEg {

	public static void main(String[] args) {
		
		Function1();
//		
		MethodsEg me = new MethodsEg();
		me.Function1();
//		me.Function3();
		
//		InheritanceEg ie = new InheritanceEg();
//		ie.sample();

	}
	
	
	public void sample()
	{
		Function1();
		Function3();
	}
	
	public static void Function1()
	{
		System.out.println("This is InheritanceEg class Function1 code");
	}
}
