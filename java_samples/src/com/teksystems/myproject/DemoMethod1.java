package com.teksystems.myproject;

public class DemoMethod1 {
	public static void main(String[] args) {
		displayfinalscore("John",calculatefinalscore(800,4,100,true));
		displayfinalscore("Gane",calculatefinalscore(600,5,200,true));
		displayfinalscore("Jelly",calculatefinalscore(900,3,50,true));
	}
	public static void displayfinalscore(String Playername,int finalscore)
	{
		System.out.println("Player Name="+ Playername +"Final Score" + finalscore);

	}
	public static int calculatefinalscore(int score,int levelcompleted,int bonus,boolean gameover)
	{
		if(gameover)
		{
			int finalScore=score+(levelcompleted*bonus);
			return finalScore;
			
		}
		return score;
	}
}
