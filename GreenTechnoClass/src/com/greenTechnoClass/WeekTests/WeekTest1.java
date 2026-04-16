package com.greenTechnoClass.WeekTests;

import java.util.Scanner;

public class WeekTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeekTest1 obj =new WeekTest1();
		obj.qus1();
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number more than 1digit");
		int num = sc.nextInt();
		obj.qus2RvNum(num);
		System.out.println("------------------------------");
		System.out.println("Give any two numbers to get the numbers in swap: ");
		System.out.println("Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Num2: ");
		int num2 = sc.nextInt();
		obj.qus3SwNum(num1, num2);
		
		
	}
	
	public void qus1() {
		int i= 9;
		while(i<11) {
			System.out.println(i + " less than 11 in while loop");
			i++;
		}
		 do { 
			  System.out.println(i + " in do while loop");
			  i++; 
			}while(i<11);
		 
	}
	
	public void qus2RvNum(int num) {
		String val = String.valueOf(num);
		
		
		for(int i=0;i<val.length();i++) {
			int mod = num%10;
			num = num/10;
			System.out.print(mod);
		}
	}
		
	public void qus3SwNum(int num1, int num2) {
		
		int add = num1 + num2;
		System.out.println(add-num1);
		System.out.println(add-num2);
		
	}
			
	

}
