package com.greenTechnoClass.WeekTests;

import java.util.Scanner;

public class WeekTest2 {
	String name = null;
	// default constructor
	WeekTest2() {
		//System.out.println("default constructor");
	}
	// Parameterized constructor
	WeekTest2(String param) {
		 name = param;
		System.out.println(name);
	}
	// Copy constructor
	WeekTest2(WeekTest2 copy) {
		name=copy.name;
		System.out.println(name);
	}
	//Main method
	public static void main(String[] args) { 
		//WeekTest2 obj = new WeekTest2();
		//System.out.println("Main Method");
		//obj.method1();
		int a = 10;
		int b = 22;
		System.out.println(a+b);
		
	}
	//sub method
	public void method1() {
		System.out.println("Sub Method");
	}
}
	/*	WeekTest2 obj = new WeekTest2();
		WeekTest2 obj1 = new WeekTest2("Param name");
		WeekTest2 obj2 = new WeekTest2(obj1);
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Give for Diamond size n= "); int n = sc.nextInt();
		 obj.printDiamond(n);
		 
		System.out.print("Give a word to check palindrome: ");
		String text=sc.nextLine();
		obj.checkPalindromeText(text);
	}

	public void printDiamond(int n) {
		int mid = 0;
		if ((n % 2) == 0) {
			mid = n / 2;
			for (int i = 2; i <= n; i += 2) {
				for (int j = 1; j <= ((n - i) / 2); j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		else {
			mid = (n / 2) + 1;
			for (int i = 1; i <= n; i += 2) {
				for (int j = 1; j <= ((n - i) / 2); j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		for (int i = (n - 2); i >= 1; i -= 2) {
			for (int j = 1; j <= ((n - i) / 2); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void checkPalindromeText(String text) {
		
		StringBuffer st = new StringBuffer(text);
		String rev = st.reverse().toString();
		System.out.println("The reverse text is "+rev);
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("The given word is Palindrome");
		}
		else {
			System.out.println("The given word is not Palindrome ");
		}
	}
}*/