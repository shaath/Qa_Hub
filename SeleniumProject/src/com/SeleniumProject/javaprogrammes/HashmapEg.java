package com.SeleniumProject.javaprogrammes;

import java.util.HashMap;
import java.util.Map;

public class HashmapEg {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Jan");
		hm.put(11, "Nov");
		hm.put(3, "Mar");
		
		
		System.out.println(hm.get(3));
		
//		for (Map.Entry<Integer, String> entry: hm.entrySet()) {
//			
//			int key = entry.getKey();
////			String mon = entry.getValue();
//			String mon = hm.get(key);
//			System.out.println(key+"--"+mon);
//			
//			
//		}

	}

}
