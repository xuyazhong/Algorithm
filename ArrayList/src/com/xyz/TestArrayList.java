package com.xyz;


public class TestArrayList {
	public static void main (String []args) {
		
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		
		System.out.println(list);

		while (!list.isEmpty()) {
			list.remove(0);			
		}
		
		System.out.println(list);
	}
}
