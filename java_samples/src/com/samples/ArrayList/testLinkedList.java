package com.samples.ArrayList;

import java.awt.List;
import java.util.LinkedList;
import java.util.Iterator;

public class testLinkedList {
	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("Kerala");
		str.add("Lonavala");
		str.add("Mumbai");
		str.add("Goa");
		str.add("Jayapur");
		printList(str);
		printList2(str);
		printList3(str);
	}
	private static void printList(LinkedList<String> mylist)
	{
		Iterator<String> it=mylist.iterator();
		while(it.hasNext())
		{
			String element = it.next();
			if (element.equalsIgnoreCase("mumbai")) {
				System.out.println("removing mumbai..");
				it.remove();
			}
			System.out.println("Now visiting... " + element);		
		}
		System.out.println("------------------");
	}
	
	private static void printList2(LinkedList<String> mylist) {
		for (String s : mylist) {
			System.out.println("Now visiting... " + s);
//			if (s.equalsIgnoreCase("mumbai")) 
//				mylist.remove(s);
		}
		System.out.println("-----------------------");
		
	}
	private static void printList3(LinkedList<String> mylist)
	{
		for (Iterator it= mylist.iterator(); it.hasNext();) 
		{
	         System.out.println(it.next());
		}
		
	}
}

