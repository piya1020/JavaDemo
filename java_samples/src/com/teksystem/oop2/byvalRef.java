package com.teksystem.oop2;

public class byvalRef {
	public static void main(String[] args) {
		
		House h1=new House("Blue");
		House h2=h1;
		System.out.println(h1.getColor());
		System.out.println(h2.getColor());
		
		h2.setColor("Red");
		System.out.println(h2.getColor());
		
		System.out.println(h1.getColor());
	}
}
