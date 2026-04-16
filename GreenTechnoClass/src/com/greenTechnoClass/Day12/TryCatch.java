package com.greenTechnoClass.Day12;

import java.util.Scanner;

public class TryCatch {
	
	public void exTryCatch() {

		System.out.println("Hello");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("bye");
	}
	
	public void catchFromUserInput() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Give an input: ");
		int num = sc.nextInt();
		System.out.println(num);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("catched");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch tc = new TryCatch();
		tc.exTryCatch();
		tc.catchFromUserInput();
		
	}
	

}
