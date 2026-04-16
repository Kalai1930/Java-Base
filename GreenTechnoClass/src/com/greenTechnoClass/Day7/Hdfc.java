package com.greenTechnoClass.Day7;

public class Hdfc extends Bank{
	
	public void salary() {
		System.out.println("Salary acc");
	}
	
	public void current() {
		System.out.println("Current acc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj = new Hdfc();
		obj.current();
		obj.salary();
		obj.savings();
	}

}
