package com.samples.aaray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers= getInteger(5);
		printMyArray(myIntegers);
		double avg=getAverage(myIntegers);
		System.out.println(" Average = "+avg);
		
		int[] newArray=new int[5];
		for(int i=0;i<myIntegers.length;i++)
		
			newArray[i]=myIntegers[i];
		
		int[] newnewAraay=Arrays.copyOf(myIntegers,myIntegers.length);
		printMyArray(newnewAraay);
		
		printMyArray(newArray);
		
	}
	private static double getAverage(int[] myIntegers) {
		int sum=0;
		for(int i=0;i<myIntegers.length;i++)
			sum += myIntegers[i];
		return sum / myIntegers.length;
	}
	private static void printMyArray(int[] myIntegers)
	{
		for(int i=0 ; i<myIntegers.length ; i++)
		{
			System.out.println("Elemeny" + i + " , Vales is" + myIntegers[i]);
		}
	}
	
	private static int[] getInteger(int number)
	{
		System.out.println(" Enter " + number +" Integer Value ");
		int[] values= new int[number];
		for(int i=0 ; i<values.length ; i++)
		{
			values[i]=sc.nextInt();
		}
		return values;
	}
	/*public static String findMin(int[] myIntegers)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<myIntegers.length;i++)
		{
			if(myIntegers[i]< min)
			{
				
			}
		}
	}*/
}
