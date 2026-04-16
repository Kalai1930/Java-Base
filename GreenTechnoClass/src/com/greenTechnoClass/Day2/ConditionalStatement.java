package com.greenTechnoClass.Day2;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int age =18; if(age >= 18) { System.out.println("Can vote"); } else {
		 * System.out.println("Can't vote"); }
		 */
		int year = 2020;
		
		if((year % 4) == 0){
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
