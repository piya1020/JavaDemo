package com.teksystems.myproject;

public class demoMethod2 {
	public static void main(String[] args) {
		
	}
	/*public static int calculatescore(String Playername,double score)
	{
		System.out.println(" Player name =" + "scored" + score +"points");
		return score*1000;
	}*/
	public static int calculatescore(String Playername,int score)
	{
		System.out.println("Player namr=" + "scored" + score +"points");
		return score*1000;
	}
	public static int calculatescore(int score)
	{
		System.out.println("Unnamed Player=" + "scored" + score +"points");
		return score*1000;
	}

}
