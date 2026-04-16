package com.greenTechnoClass.Day11;

import java.util.ArrayList;

public class Exception {

	
	public static void main(String[] args) {
		
		//arithematic exception 
		/*System.out.println(20);
		System.out.println(10/0);
		System.out.println(50);*/
		
		//Null pointer exception
		/*String s = null;
		System.out.println(s.length()); */
		
		//Input mismatch Exception - to get the exception instead int give string
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("User age "+age ); */
		
		//ArrayIndexOutOfBound Exception
	/*	int [] arr = {2,3,4,5,6,6};
		System.out.println(arr[10]); */
		
		//StringIndexOutOfBoundsException - The char index on the string is 0 to 4
	/*	String s = "Kalai";
		char c = s.charAt(5);
		System.out.println(c); */
		
		//IndexOutOfBoundsException: Index 5 out of bounds for length 4
	/*	ArrayList<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		
		System.out.println(ex.get(5)); */
		
		//NumberFormatException - For input string: "123Abc45" can't convert to int
		String s="1234";
		System.out.println(s+5);
		
		int i=Integer.parseInt(s);
		System.out.println(i+5);
		
		String s1="123Abc45";
		int j = Integer.parseInt(s1);
		
		System.out.println(j+5);
	}
}
