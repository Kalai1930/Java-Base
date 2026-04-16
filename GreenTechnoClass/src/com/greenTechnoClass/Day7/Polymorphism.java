package com.greenTechnoClass.Day7;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism obj = new Polymorphism();
		obj.student("Kalai");
		obj.student(34);
		obj.student(true);

	}
	
	//Polymorphism method overloading
	public void student(String name) {
		System.out.println(name);
	}
	public void student(int age) {
		System.out.println(age);
	}
	public void student(boolean isactive) {
		System.out.println(isactive);
	}
	
}
