package com.greenTechnoClass.Day9;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeDay9 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeDay9 pobj = new PracticeDay9();
		pobj.sortAList();
		pobj.sumAList();
	}
	//Write a java program to sort the array list
	public void sortAList() {
		ArrayList<Integer> alst = new ArrayList<Integer>();
		alst.add(4);
		alst.add(1);
		alst.add(9);
		alst.add(0);
		Collections.sort(alst);
		System.out.println(alst);
		
		ArrayList<String> salst = new ArrayList<String>();
		salst.add("mango");
		salst.add("apple");
		salst.add("grapes");
		salst.add("banana");
		salst.add("stawberry");
		Collections.sort(salst);
		System.out.println(salst);
		
	}
	
	//write a java program to sum of array list
	public void sumAList() {
	ArrayList<Integer> alst = new ArrayList<Integer>();
	alst.add(4);
	alst.add(1);
	alst.add(9);
	alst.add(0);
	int sum=0;
	for(int i:alst) {
		sum+=i;
	}
	System.out.println(sum);
	
	}

}
