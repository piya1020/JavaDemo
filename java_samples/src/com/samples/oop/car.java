package com.samples.oop;

public class car {
	
	private String fueltype;
	private int noofwheel;
	private int geartype;
	private String color;
	
	@Override
	public String toString() {
		return "car [fueltype=" + fueltype + ", noofwheel=" + noofwheel + ", geartype=" + geartype + ", color=" + color
				+ "]";
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getNoofwheel() {
		return noofwheel;
	}
	public void setNoofwheel(int noofwheel) {
		this.noofwheel = noofwheel;
	}
	public int getGeartype() {
		return geartype;
	}
	public void setGeartype(int geartype) {
		this.geartype = geartype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
