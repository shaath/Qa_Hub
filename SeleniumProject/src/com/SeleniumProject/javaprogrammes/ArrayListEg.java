package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		List<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(200000);
		al.add(true);
		al.add('B');
		al.add(334243.43342);
		al.add("Apple");
		al.add("Selenium");
		al.add(7, "Shiva");
		al.add(2, "Cat");
		al.add(9, "API Testing");
		
//		al.remove(2);
//		al.remove("Selenium");
//		al.clear();
		al.set(5, "Java");
		
//		System.out.println(al.get(1));
		System.out.println(al.size());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
