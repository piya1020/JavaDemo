package com.teksystems.myproject;

public class Operators {
	public static void main(String args[])
	{
		int result=1+2;
		result = result*10;
		int rem=result/4;
		System.out.println(rem);
		
		//result++;
		result--;
		
		System.out.println(result);
		
		boolean isTemp=true;
		if(isTemp) 
		{
			System.out.println("Temp Value");
		}
		int topscore=100;
		if(topscore==100)
		{
			System.out.println("High Score");
		}
		else
			System.out.println("Low Score");
		
		boolean myflag;//=false;
		if(myflag=false)
		{
			System.out.println("1");
		}
		else
			System.out.println("2");
		
		topscore=100;
		int secondtopscore=200;
		if(topscore > secondtopscore || topscore<=100 )
		{
			System.out.println("Just Missed");
		}
		else
			System.out.println("Correct");
		
		int age=12;
		/*if(age>18)
		{
			System.out.println("Person can vote");
		}
		else
			System.out.println("person can't vote");
		*/
		//String msg=(age>20) ? "person can vote" :"can't vote";  //ternary operator
		//System.out.println(msg);
		
		boolean iscaravailable=false;
		String msg1=(age>20)?(iscaravailable)?"rent a car":"wait for while":"wait for while";
		System.out.println(msg1);
				
	}

}
