package com.teksystems.myproject;

public class Demo2C {
	public static void main(String[] args) {
		Accout a1=new Accout("12345",245.89,"Priya","priyachougule1020@gmail.com","8177873065");
		System.out.println(a1.getCustomername());
		System.out.println(a1.getCustomerEmail());
		System.out.println(a1.getBalance());
		System.out.println(a1.getNumber());
		System.out.println(a1.getPhonenumber());
		
		System.out.println("\n");

		Accout a2=new Accout("54321",2678.856,"Aishi","aisg@gmail.com","1234567898");
		System.out.println(a2.getCustomername());
		System.out.println(a2.getCustomerEmail());
		System.out.println(a2.getBalance());
		System.out.println(a2.getNumber());
		System.out.println(a2.getPhonenumber());

	}

}
