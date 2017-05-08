package com.coding.basic;


public class ArrayList implements List {
	
	private int size = 0;
	
	private Object[] elementData = new Object[5];
	
	public void add(Object o){
			add(size, o);
		}
		
	private void  ensureExtends(int size) {
		
		if(size >elementData.length){
			int newSize = (elementData.length*3)/2+1;
			if(newSize<size){
				newSize = size;
			}
			Object[] newElementData = new Object[newSize];
			System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
			elementData = newElementData;
			
		}
		
	}
	public void add(int index, Object o){
		checkIndexOutIndex(index,size);
		ensureExtends(size+1);
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index] = o;
		size++;
	}
	
	public Object get(int index){
		checkIndexOutIndex(index,size-1);
		return elementData[index];
	}
	
	public Object remove(int index){
		checkIndexOutIndex(index, size-1);
		Object o = elementData[index];
		if(size-index-1>0){
			System.arraycopy(elementData, index+1, elementData, index, size-index-1);
		}
		elementData[--size] = null;
		return o;
	}
	
	public int size(){
		return size;
	}
	
	public Iterator iterator(){
		return new IteratorImp();
	}
	
	public void checkIndexOutIndex(int index,int size){
		if(index<0||index>size){
			throw new IndexOutOfBoundsException("index 数组越界异常:"+index);
		}
	}
	
	class IteratorImp implements Iterator{
		int coursor = 0;
		@Override
		public boolean hasNext() {
			if(size==0||coursor>=size){
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			
			return get(coursor++);
		}
		
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<size;i++){
			sb.append((String)elementData[i]).append(",");
		}
		return sb.subSequence(0, sb.length()-1).toString();
		
	}
}