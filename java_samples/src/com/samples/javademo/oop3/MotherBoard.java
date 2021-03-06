package com.samples.javademo.oop3;

public class MotherBoard {
	private String model;
	private String manufacturer;
	private int ramslots;
	private int cardslots;
	private String bios;
	
	public MotherBoard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramslots = ramslots;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName)
	{
		System.out.println(" Program " + programName + " is now Loading.... ");
	}
}
