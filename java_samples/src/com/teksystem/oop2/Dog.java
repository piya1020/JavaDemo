package com.teksystem.oop2;

public class Dog extends Animal
{
	private int eye;
	private int leg;
	private int tail;
	
	
	public Dog(String name, int size, int weight, int eye, int leg, int tail) {
		super(name, size, weight);
		this.eye = eye;
		this.leg = leg;
		this.tail = tail;
	}
	public void movelegs(int speed)
	{
		System.out.println("Dog.movelegs() called");
	}
	public void move(int speed)
	{
		System.out.println("Doge.move() called");
		movelegs(speed);
		super.move(speed);
	}
	
	public void walk()
	{
		System.out.println("Dog.walk called");
		
		move(5);
	}
	public void run()
	{
		System.out.println("Dog.run() called");
		move(10);
	}
	public void chew()
	{
		System.out.println("Dog.chew() called");
	}
	public void eat()
	{
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}


	/*public Dog(String name,int size,int weight)
	{
		super(name,size,weight);
	}*/
}


