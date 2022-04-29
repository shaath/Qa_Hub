package com.SeleniumProject.javaprogrammes;

public class MethosEg_Resuse {

	public static void main(String[] args) {
		
		MethodsEg.Function1();
		MethodsEg me = new MethodsEg();
		
//		me.Function1();

//		String res = me.Function2();
//		System.out.println(res);
		
		int res = me.sum(70, 80);
		System.out.println(res);
		
		res = me.sum(10, 20, 30);
		System.out.println(res);
		
	}

}
