package com.teksystems.myproject;

public class typecasting {
	
	public static void main(String args[])
	{
		System.out.println("Implicit TypeCasting");
		char a='A';
		System.out.println("value of a"+a);
		
		int b=a;
		System.out.println("value of b"+b);
		
		float c=a;
		System.out.println("value of c"+c);
		
		long d= a;
		System.out.println("value of d"+d);
		
		double e=a;
		System.out.println("value of e"+e);
		
		System.out.println("\n");
		
		System.out.println("Explicit TypeCating");
		
		double x=45.5;
		int y=(int)x;
		
		System.out.println(""+x);
		System.out.println(""+y);
	}

}
