package com.greenTechnoClass.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticeTest {
	
	//Write a program to remove duplicates from sorted array
	public void removeDuplicates() {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("glass");
		al.add("metal");
		al.add("silver");
		al.add("gold");
		al.add("bronze");
		al.add("gold");
		
		Collections.sort(al);
		
		System.out.println("Sorted array: "+ al);
		
		for(int j=0;j<al.size();j++) {
			
			for(int i=j+1;i<al.size();i++) {
				if((al.get(j)).equalsIgnoreCase(al.get(i))) {
					al.remove(al.get(i));
				}
			}
		}
		System.out.println("After removing duplicates: "+al);
	}

	//Student grade:
	public void stuGrade(int marks) {
		if((marks>=65) && (marks<=89)) {
			System.out.println("Grade B");
		}
		else if((marks>89) && (marks<=100)) {
			System.out.println("Grade A");
		}
		else if((marks>=35) && (marks<=64)) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeTest pt = new PracticeTest();
		pt.removeDuplicates();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give marks of a student");
		pt.stuGrade(sc.nextInt());
	}

}
