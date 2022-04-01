package com.samples.javademo.oop3;

public class Box {
	private String model;
	private String manufacturer;
	private String powersupply;
	public Box(String model, String manufacturer, String powersupply) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
	}
	
	public void pressPowerButton()
	{
		System.out.println("Power Button Pressed");
	}
}
