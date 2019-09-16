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
		
		list.add(0, 100);
		list.add(0, 102);
		list.add(0, 103);
		System.out.println(list);

	}
}
