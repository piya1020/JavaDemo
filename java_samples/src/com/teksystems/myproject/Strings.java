package com.teksystems.myproject;

public class Strings {
	public static void main(String args[])
	{
		String s1="Hello";
		//System.out.println(s1);
		String s2= s1+ "World";
		String s3="45";
		int intx=Integer.parseInt(s3);
		int x=10;
		s2=s1+x;
		System.out.println(s2);
		
		double doublenumber=170.7d;
		String mydouble="Hello"+doublenumber;
		System.out.println("mystring double="+mydouble);
		
		/*try
		{
			function1();
		}
		catch(Exception e)
		{
			System.out.println("Throw Exception");
		}
		static void function1()
		{
			function2();
		}
		
		
		public static void function2()
		{
			String s4 = "45X" ;
			try
			{
			intx=Integer.parseInt(s4);
			}
			catch(Exception e)
			{
				System.out.println("Number Format Exception");
			}
			System.out.println(intx);
		
		}*/
	}

}
