package com.teksystems.myproject;

import java.util.Scanner;

public class DemoUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter 1 number");
		int a=sc.nextInt();
		System.out.println("enter 2 number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition="+c);*/
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter City");
		String city=sc.nextLine();
		
		System.out.println("Name:"+ name + " Address:" +city);
	}
}
