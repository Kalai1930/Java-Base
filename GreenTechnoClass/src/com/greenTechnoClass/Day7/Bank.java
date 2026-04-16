package com.greenTechnoClass.Day7;

//This is a partial abstraction since this class have both abstract and normal method
public abstract class Bank {
	//abstract method does not have method definition in abstract class
	abstract void current();
	abstract void salary();
	public void savings() {
		System.out.println("Saving acc");
	}

}
