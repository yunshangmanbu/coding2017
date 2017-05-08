package com.coding.basic;

public class Stack {
	private ArrayList elementData = new ArrayList();
	public void push(Object o){		
		elementData.add(o);
	}
	
	public Object pop(){
		int size = elementData.size();
		return elementData.remove(size);
	}
	
	public Object peek(){
		int size = elementData.size();
		return elementData.get(size);
	}
	public boolean isEmpty(){
		return elementData.size()==0;
	}
	public int size(){
		return elementData.size();
	}
}
