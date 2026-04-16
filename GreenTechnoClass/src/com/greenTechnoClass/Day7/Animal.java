package com.greenTechnoClass.Day7;

public class Animal {

	//runtime polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();

	}
	public void sound() {
		System.out.println("animal sound");
	}

}
