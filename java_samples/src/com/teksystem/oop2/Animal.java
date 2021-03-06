package com.teksystem.oop2;

public class Animal {
	
	private String name;
	private int size;
	private int weight;
	public String getName() {
		return name;
	}
	
	public void eat()
	{
		System.out.println("Animal.eat().called");
	}
	public void move(int speed)
	{
		System.out.println("Animal.move()called"+speed);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Animal(String name, int size, int weight) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
	}

}
