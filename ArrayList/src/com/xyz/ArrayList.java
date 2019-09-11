package com.xyz;

public class ArrayList {
	
	static int DEFAULT_CAPACITY = 10;
	
	private int [] dataArray;
	public int size = 0;
	private int countSize = DEFAULT_CAPACITY;
	
	public ArrayList() {
		dataArray = new int [DEFAULT_CAPACITY];
		
	}
	
	public void append (int ele) {
		if ((size + 1) < countSize) {
			dataArray[size+1] = ele;
		} else {
			
		}
		size ++;
	}
	
	public void remove(int index) {
		for (int i = index; i < dataArray.length-1; i++) {
			dataArray[i] = dataArray[i+1];
		}
		size --;
	}
	
	public void insert(int index, int element) {
		dataArray[index] = element;
		for (int i = dataArray.length-1; i > index; i--) {
			dataArray[i] = dataArray[i-1];
		}
	}
	
	public int get(int index) {
		return dataArray[index];
	}
	
	public void clear() {
		size = 0;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("string Array => [");
		for (int i = 0; i < dataArray.length; i++) {
			if (i>0) {
				buffer.append(",");
			}
			buffer.append(dataArray[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
	

}
