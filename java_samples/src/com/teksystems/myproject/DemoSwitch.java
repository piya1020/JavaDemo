package com.teksystems.myproject;

public class DemoSwitch {
	public static void main(String[] args) {
		
		int switchval=6;
		
		switch(switchval)
		{
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("Other Value");
				
		}
		
		String month="Jan";
				
				switch(month)
				{
					case "Jan":
						System.out.println("Jan");
						break;
					case "Feb":
						System.out.println("Feb");
						break;
					case "Mar":
						System.out.println("Mar");
						break;
					default:
						System.out.println("Other month");
						
				}

			
		
	}

}
