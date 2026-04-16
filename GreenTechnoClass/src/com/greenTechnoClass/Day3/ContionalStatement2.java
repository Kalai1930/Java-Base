package com.greenTechnoClass.Day3;

public class ContionalStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;
		
		if(i< 20) {
			System.out.println("allow to work");
		}
		else if(i == 20) {
			System.out.println("allow to work");
		}
		else {
			System.out.println("Don't allow to work");
		}
		
		int day=2;
		
		switch(day) {
		
		case 1: System.out.println("sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		default: System.out.println("not a week of a day");
		}

	}
}
