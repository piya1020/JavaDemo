package com.samples.oop;

public class Demo1 {
	public static void main(String[] args) 
	{
		car hondacity=new car();	
		hondacity.setColor("Black");
		hondacity.setFueltype("Petrol");
		hondacity.setGeartype(5);
		hondacity.setNoofwheel(4);
		System.out.println(hondacity);
		
		car maruti=new car();
		maruti.setColor("White");
		maruti.setFueltype("Diseal");
		maruti.setGeartype(3);
		maruti.setNoofwheel(4);
		System.out.println(maruti);
		
	}

}
