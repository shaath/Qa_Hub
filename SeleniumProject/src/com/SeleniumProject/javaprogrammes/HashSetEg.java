package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add("Boll");
		hs.add("UFT");
		hs.add("Apple");
		hs.add("Manual");
		hs.add("Boll");
		
//		Iterator<String> it = hs.iterator();
//		
//		while(it.hasNext())
//		{
//			String data = it.next();
//			System.out.println(data);
//		}

		for (String data : hs) {
			System.out.println(data);
		}
		
	}

}
