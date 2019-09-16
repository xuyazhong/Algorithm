package com.xyz;


public class ArrayList {
	static int DEFAULT_CAPACITY = 10;
	
	private int [] dataArray;
	public int size = 0;
	private int countSize = DEFAULT_CAPACITY;
	
	public ArrayList() {
		dataArray = new int [DEFAULT_CAPACITY];
	}
	
	public Boolean isEmpty() {
		return size == 0;
	}
	
	public Boolean contains(int ele) {
		return indexOf(ele) != -1;
	}
	
	public void add(int ele) {
		add(size, ele);
	}
	
	public int get(int index) {
		return dataArray[index];
	}
	
	public void set(int index, int ele) {
		dataArray[index] = ele;
	}
	
	public void add(int index, int ele) {
		if (index > size) {
			System.out.println("error");
			return;
		}
		arrayCheck(index);
		if (index < size) {
			for (int i = dataArray.length-1; i > index; i--) {
				dataArray[i] = dataArray[i-1];
			}
		}
		dataArray[index] = ele;
		size ++;
	}
	
	private void arrayCheck(int index) {
		if (index >= countSize) {
			int newSize = countSize >> 1;
			countSize = countSize + newSize;
			int [] newArr = new int[countSize];
			for (int i = 0; i < size; i++) {
				newArr[i] = dataArray[i];
			}
			System.out.println(size + " 扩容 => " + countSize);
			dataArray = newArr;
		}
	}
	
	private void arrayNarrow() {
		int calcSize = countSize >> 1;
		if (calcSize < DEFAULT_CAPACITY)
			return;
		if (size < calcSize) {
			int [] newArr = new int[calcSize];
			for (int i = 0; i < size; i++) {
				newArr[i] = dataArray[i];
			}
			System.out.println(countSize + " 缩容 => " + calcSize);
			countSize = calcSize;
			dataArray = newArr;
		}
	}
	
	public void remove(int index) {
		for (int i = index; i < dataArray.length-1; i++) {
			dataArray[i] = dataArray[i+1];
		}
		size --;
		arrayNarrow();
	}
	
	public int indexOf(int ele) {
		for (int i = 0; i < dataArray.length; i++) {
			int data = dataArray[i];
			if (data == ele) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		size = 0;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("string Array => [");
		for (int i = 0; i < size; i++) {
			if (i>0) {
				buffer.append(",");
			}
			buffer.append(dataArray[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}

}
