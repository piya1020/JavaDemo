package com.samples.oop7.abstractclass;

import java.util.ArrayList;
import java.util.Scanner;

public class testArrayList3 {
	
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		 int size=5;
		 ArrayList<Integer> intlist=new ArrayList<Integer>();
		 
		 System.out.println(" Enter " +size + " integer values.\r ");
		 for(int i=0;i<size;i++)
		 {
			 intlist.add(sc.nextInt());
		 }
		 
		 for(Integer i: intlist)
			 System.out.println(i);
		 
		
		 
	}

}
