package com.greenTechnoClass.Day8;

public class Person_Cons {
	
	String name;
	
	//default constructor
	 Person_Cons() {
		// TODO Auto-generated constructor stub
		name = "kalai";
		System.out.println("Name is : "+name);
	}
	 
	//Parameterised constructor
	Person_Cons(String n){
		name = n;
		System.out.println(name);
	}
	
	//Copy constructor
	Person_Cons(Person_Cons p){
		name = p.name;
		System.out.println(name);
	}
	
	public void display() {
		System.out.println("Name is : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Cons objCons = new Person_Cons("Bharathi");
		Person_Cons p1= new Person_Cons(objCons);
		
	}

}
