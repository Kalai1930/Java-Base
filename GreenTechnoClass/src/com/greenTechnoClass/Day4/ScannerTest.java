package com.greenTechnoClass.Day4;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your details");
		String name = obj.nextLine();
		System.out.println("user name : " + name);
		int age = obj.nextInt();
		System.out.println("user age : "+age);

	}

}
