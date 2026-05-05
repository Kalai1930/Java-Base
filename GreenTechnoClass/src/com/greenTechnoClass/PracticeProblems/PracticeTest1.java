package com.greenTechnoClass.PracticeProblems;

import java.util.Arrays;

public class PracticeTest1 {

	public static void main(String[] args) {
		PracticeTest1 pt = new PracticeTest1();
		
		/*int[] arr = {87,34,546,34,543,367,344};
		int val = 543;
		int pos = pt.binarySearch(arr, val);
		if(pos != -1) {
		System.out.println("the position of "+val+" is "+pos);
		}
		else {
			System.out.println("The value is not in the given array");
		}*/
		 pt.longestSubString();
		
		
		
		
	}
	
	//butterfly shuffle
	public void butterflyshuffle() {
		int[] arr = {3,6,7,8,4,5,9,0,2,1};
		Arrays.sort(arr);
		int half = (arr.length)/2;
		for(int i=half;i>=0;i--) {
			System.out.println(arr[i]);
		}
		for(int i=(arr.length-1);i>half;i--) {
			System.out.println(arr[i]);
		}
	}
	
	//Binary search
	public int binarySearch(int[] arr, int pos) {
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int half = (start+end)/2;
			if(pos == arr[half]) {
				return half;
			}
			if(pos < arr[half]) {
				end = half-1;
			}
			else {
				start = half+1;
			}
		}
		return -1;
		}
	
	//Remove duplicates from the sorted array
	public void removeDuplicates() {
		int[] arr = {8,34,75,3,67,3,23,8,34,75};
		
		Arrays.sort(arr);
		//int i = 0;
		int j = 0;
		int[] rmdup = new int[arr.length];
		// 3,3,8,8,23,34,34,67,75,75
		for(int i=0; i< arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				rmdup[j++]=arr[i];
			}
		}
		rmdup[j++] = arr[arr.length-1];
		// copyof method will set the new length to the array.
		int[] uniqueArr = Arrays.copyOf(rmdup, j);
		System.out.println(Arrays.toString(uniqueArr));	
	}
	public void nthLarge(int num) {
		int[] arr = {8,34,75,3,67,3,23,8,34,75};
		Arrays.sort(arr);
		//int[] desc = new int[arr.length];
		int j = 0;
		int[] rmdup = new int[arr.length];
		// 3,3,8,8,23,34,34,67,75,75
		for(int i=0; i< arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				rmdup[j++]=arr[i];
			}
		}
		rmdup[j++] = arr[arr.length-1];
		// copyof method will set the new length to the array.
		int[] uniqueArr = Arrays.copyOf(rmdup, j);
		int k=uniqueArr.length-1;
		int[] descArr = new int[uniqueArr.length];
		for(int i=0;i<descArr.length;i++) {
			descArr[i]=uniqueArr[k--];
		}
		System.out.println(Arrays.toString(descArr));
		System.out.println(descArr[num-1]);
	}
	
	// Longest substring without repeating characters 
	 
	//INPUT     OUTPUT 
	//java2novice   = a2novice 
	//java_language_is_sweet = uage_is 
	//java_java_java_java  = va_j, _jav 
	//abcabcbb    = bca, abc, cab
	
	public void longestSubString() {
		
		String str="java2novice";
		char[] splitStr = str.toCharArray();
		
		char[] unique = new char[splitStr.length];
		int k=0;
		for(int i=0;i<splitStr.length;i++) {
			for(int j=0;j<splitStr.length;j++) {
				if(splitStr[i] != splitStr[j]) {
					
					unique[k++]=splitStr[j];
				}
			}
		}
	
	}
}
