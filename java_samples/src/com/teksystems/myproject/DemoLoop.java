package com.teksystems.myproject;

public class DemoLoop {
	public static void main(String[] args) {
		
		for(int i=2;i<=5;i++)
		{
			//System.out.println("Loop" + i + "Hello");
			System.out.println("10,000 at" + i + "%interest=" + calculateIntreset(10000.0,i));
		}
	}
	private static double calculateIntreset(double amount,double intresetrate)
	{
	
		return (amount * (intresetrate/ 100));
	}

}
