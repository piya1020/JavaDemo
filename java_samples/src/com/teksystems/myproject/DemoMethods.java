package com.teksystems.myproject;

public class DemoMethods {
	public static void main(String[] args) {
		
		calculatescoreJohn("John",800,5,100,true);
		calculatescoresneha("Sneha",600,3,200,true);
		calculatescoreaishi("Aishwarya",900,5,250,true);
		
	}
	public static void calculatescoreJohn(String Playernm,int score,int levelcompleted,int bonus,boolean gameOver)
	{
		/*String Playernm="John";
		int score=800;
		int levelcompleted=5;
		int bonus=100;
		boolean gameOver=true;
		*/
		if(gameOver)
		{
			int finalScore=score+(levelcompleted*bonus);
			System.out.println("Player Name="+ Playernm + "Final Score" + finalScore);
		}
	}
	public static void calculatescoresneha(String Playernm,int score,int levelcompleted,int bonus,boolean gameOver)

	{
		/*String Playernm="sneha";
		int score=600;
		int levelcompleted=3;
		int bonus=200;
		boolean gameOver=true;*/
		
		if(gameOver)
		{
			int finalScore=score+(levelcompleted*bonus);
			System.out.println("Player Name="+ Playernm +"Final Score"+finalScore);
		}
	}
	public static void calculatescoreaishi(String Playernm,int score,int levelcompleted,int bonus,boolean gameOver)

	{
		/*String Playernm="aishi";
		int score=900;
		int levelcompleted=4;
		int bonus=50;
		boolean gameOver=true;*/
		
		if(gameOver)
		{
			int finalScore=score+(levelcompleted*bonus);
			System.out.println("Player Name="+ Playernm +"Final Score"+finalScore);
		}
	}
	

}
