package com.greenTechnoClass.Day6;

import java.util.Scanner;

public class PracticeDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeDay6 obj = new PracticeDay6();
		Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter a number to check prime"); 
		 int num = sc.nextInt();
		  obj.checkPrime(num);
		 
		  obj.triangleStar();
	}
	
	public void checkPrime(int num) {
		int count =0;
		if(num<=1) {
			System.out.println("Given number should be greater than 1");
		}
		else if(num==2) {
			System.out.println("The given number is an even prime");
		}
		else if((num%2)==0) {
			System.out.println("The given number is not a prime");
		}
		else {
			for(int i=2;i<=(num/2);i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("The given number is prime");
			}
			else {
				System.out.println("The given number is not prime");
			}
		}
	}
	public void triangleStar() {
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
