package com.teksystems.myproject;

public class DemoWhile {
	public static void main(String[] args) {
		int count=0;
		
		while(count!=5) 
		{
			System.out.println("Count value"+count);
			count++;
		}
		
		count=6;
		do {
			System.out.println("Count value is"+count);
			count++;
		}while(count<20);
	}
}
