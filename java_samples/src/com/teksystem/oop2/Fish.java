package com.teksystem.oop2;

public class Fish extends Animal{
	private int gills;
	private int fins;
	private int eyes;
	
	
	public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
		super(name, size, weight);
		this.gills = gills;
		this.fins = fins;
		this.eyes = eyes;
	}
	public void move(int speed)
	{
		System.out.println("Dog.speed() called"+speed);
	}
	
	public void swim()
	{
		System.out.println("Fish.swim() called");
		//super.move(speed);
		
	}
	public void moveMuscles()
	{
		System.out.println("Fish.movemuscles() called");
	}
	public void moveBackFin()
	{
		System.out.println("Fish.movebackfin() called");
	}

}
