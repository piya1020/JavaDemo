package com.teksystem.oop2;

public class StringHandling {
	public static void main(String[] args) {
		String s1=new String("Hello World");
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		
		String s2=new String("welcome");
		System.out.println(s2.substring(2));
		
		String s3="Word";
		String s4="World";
		System.out.println(s3.compareTo(s4));
		
		String s5="";
		System.out.println(s5.isEmpty());
		
		StringBuffer sb=new StringBuffer("Hello world");
		System.out.println(sb.toString());
		sb.append(" to ");
		sb.append(" Everyone ");
		System.out.println(sb.toString());
		sb.replace(6, 11," Java ");
		System.out.println(sb.toString());
		
		StringBuilder sb1=new StringBuilder();
		sb1.append("Feet");
		System.out.println(sb1.toString());
		
	}

}
