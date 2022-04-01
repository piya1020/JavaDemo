package com.samples.oop6.interfaces;

public class DeskPhone implements ITelephone {
	
	@Override
	public void powerOn() {
		System.out.println("No action . Always on  ");
		
	}

	@Override
	public void dial(int phonenumber) {
		System.out.println("Now Ringing" +phonenumber + "On deskphone ");
		
	}

	@Override
	public boolean callphone(int phonenumber) {
		System.out.println(" Calling ");
		return false;
	}

	@Override
	public boolean isringing() {
		System.out.println("Ringing");
		return false;
	}

	@Override
	public boolean answar() {
		System.out.println("Answering");
		return false;
	}

}
