package com.hskj.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.coding.basic.ArrayList;
import com.coding.basic.Iterator;

public class TestArrayList {
	
	private ArrayList list ;

	@Before
	public void setUp() throws Exception {
		list = new ArrayList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddObject() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.add("hskj004");
		list.add("hskj005");
		list.add("hskj006");
		list.add("hskj007");
		System.out.println(list);
		Assert.assertEquals("hskj001,hskj002,hskj003,hskj004,hskj005,hskj006,hskj007", list.toString());
	}

	@Test
	public void testAddIntObject() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.add(2, "hskj005");
		Assert.assertEquals("hskj001,hskj002,hskj005,hskj003", list.toString());
	}
	
	

	@Test
	public void testGet() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.add(2, "hskj005");
		Assert.assertEquals("hskj001,hskj002,hskj005,hskj003", list.toString());
	}

	@Test
	public void testRemove() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.remove(1);
		Assert.assertEquals("hskj001,hskj003", list.toString());
	}

	@Test
	public void testSize() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.add(2, "hskj005");
		list.add("hskj004");
		list.add("hskj006");
		Assert.assertEquals(6, list.size());
	}

	@Test
	public void testIterator() {
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		Iterator itr = list.iterator();
		StringBuilder sb = new StringBuilder();
		while(itr.hasNext()){
			String str = (String)itr.next();
			sb.append(str).append(",");
		}
		String result = sb.substring(0, sb.length()-1).toString();
		
		Assert.assertEquals("hskj001,hskj002,hskj003", result);
	}

	@Test
	public void testCheckIndexOutIndex() {
		try{
		list.add("hskj001");
		list.add("hskj002");
		list.add("hskj003");
		list.checkIndexOutIndex(-1, list.size());
		fail("add -1 not throw Exception");
		}catch(Exception e){
			System.out.println("-1 exception");
		}
		try{
			list.checkIndexOutIndex(4, list.size());
			fail("add 4 not throw Exception");
		}catch(Exception e){
			System.out.println("4 exception");
		}
	}

}
