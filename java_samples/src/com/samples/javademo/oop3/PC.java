package com.samples.javademo.oop3;

public class PC {
	 private Box box;
	 private Monitor monitor;
	 private MotherBoard motherboard;
	
	 public PC(Box box, Monitor monitor, MotherBoard motherboard) {
		super();
		this.box = box;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	 public void powerup()
	 {
		 box.pressPowerButton();
		 drawLogo();
		 motherboard.loadProgram(" Windows 10 ");
	 }
	 
	 private void drawLogo()
	 {
		 monitor.drawPixelAt(1200,50," yellow ");
	 }

	 
}
