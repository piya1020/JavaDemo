package com.teksystems.myproject;

public class Demo2 {
	public static void main(String args[])
	{
		int n1=6;
		int n2=5;
		System.out.println(n1+n2);
		System.out.println("total" + " " +n1 + n2);
		
		byte xbyte = 10;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short xshort = 20;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		int intx =xbyte;//implicit casting
		System.out.println(intx);
		
		int inty=20;
		byte by=(byte)inty;//explicit casting
		System.out.println(by);
		
		inty=200;
		by=(byte)inty;
		System.out.println(by);
		
		long long1=100L;
	}

}
