package com.greenTechnoClass.Day5;

import java.util.Scanner;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeTest obj = new PracticeTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("give a number to check Palindrome");
		int num = sc.nextInt();
		obj.palindromeCheck(num);
		System.out.println("--------------------------------");
		System.out.println("Give a number to check Armstrong number");
		int num1=sc.nextInt();
		obj.armstrongNum(num1);
	}
	
	public void palindromeCheck(int num) {
		int mod=0;
		int rev=0;
		int ver =num;
		while(num>0) {
			mod = num%10;
			num = num/10;
			rev = rev*10+mod;
			//System.out.print(mod);
		}
		System.out.println(rev);
		
		if(ver==rev) {
			System.out.println("The given is a palindrome number");
		}
		else
		{
			System.out.println("The given is not a palinodrome number");
		}
	}
	
	public void armstrongNum(int num) {
		
		/*An Armstrong number (also called a narcissistic number) is a number that 
		 * is equal to the sum of its digits each raised to the power of the number of digits. 
		 * For example, 153 is an Armstrong number because the no. of digit is 3 
		 * so the power of each digit should be 3 and the sum of all cubes is equal to the given number
		 *  1^3+5^3+3^3=153.
		 */
		String len = String.valueOf(num);
		int d = len.length();
		int mod =0;
		double amNum = 0;
		int cal = num;
		
		while(cal>0) {
			mod = cal%10;
			cal = cal/10;
			amNum = amNum + (Math.pow(mod, d));
		}
		
		if(num == amNum) {
			System.out.println("Its an Armstrong number");
		}
		else {
			System.out.println("Its not an Armstrong number");
		}
		
		
	}

}
