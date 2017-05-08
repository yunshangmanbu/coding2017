package com.coding.basic;

public class BinaryTreeNode<T extends Comparable<T>> {
	
	private T data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public  BinaryTreeNode(T data,BinaryTreeNode left,BinaryTreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	public BinaryTreeNode insert(T o){
		if(o==null){
			return this;
		}
		if(o.compareTo(this.data)>0){
			while(right!=null){ 
				return right.insert(o);
			}
			BinaryTreeNode<T> bt = new BinaryTreeNode<T>(o,null,null);
			this.right = bt;
			
			
		}else if(o.compareTo(this.data)<0){
			while(left!=null){
				return left.insert(o);
			}
			BinaryTreeNode<T> bt = new BinaryTreeNode<T>(o,null,null);
			this.left = bt;
		}
		return this;
	}
	
}
