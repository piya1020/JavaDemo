package com.teksystem.oop2;

public class oop2Demo {
	public static void main(String[] args) {
		Dog dog=new Dog("york",10,20,2,4,1);
		dog.eat();
		//dog.move(10);
		dog.walk();
		dog.run();
		
		Fish f=new Fish("Fishy",5,3,2,2,2);
		f.move(10);
		f.swim();
		f.moveMuscles();
		f.moveBackFin();
	}

}
