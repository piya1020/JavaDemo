package com.samples.javademo.oop3;

public class Testcomposition {
	public static void main(String[] args) {
		Box b=new Box(" 220B "," Dell "," 244 ");
		
		Monitor m=new Monitor(" 27 Inch "," Acer ",27);
		
		MotherBoard mb=new MotherBoard(" BJ-200 "," Aus ",4,6," V2.444 ");
		
		PC pc=new PC(b,m,mb);
		pc.powerup();
	}

}
