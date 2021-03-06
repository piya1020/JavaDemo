package com.samples.oop7.abstractclass;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class testArrayList2 {
	
public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		strList.add("java");
		strList.add("coding");
		strList.add("is fun");
		System.out.println("strList: " + strList);
		
		int x = 10;
		Integer z = Integer.valueOf(x);	// this process of converting primitive 
										//   to wrapper, is called 'Boxing'
		Integer newvar = 11;			// Auto-Boxing
		int y = newvar.intValue();		// un-boxing
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		System.out.println("list1 = " + list1);
		
		list1.remove(3);
		System.out.println("list1 = " + list1);
		list1.remove(3);
		System.out.println("list1 = " + list1);
		
		list1.add(3, 120);
		System.out.println("list1 = " + list1);
		
		System.out.println(list1.set(2, 30));
		System.out.println("list1 = " + list1);
		
		list1.add(345);
		System.out.println("list1 = " + list1);
		
		list1.add(0, 100);
		System.out.println("list1 = " + list1);
		
		list1.set(list1.size()-1, 102);
		System.out.println("list1 = " + list1);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i=0; i<100; i++) 
			newList.add(i);
		
	}
}
