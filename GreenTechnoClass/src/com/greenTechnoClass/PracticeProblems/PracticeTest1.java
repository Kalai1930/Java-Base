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
		//pt.removeDuplicates();
		int i = 0;
		int f = 1;
		
		System.out.println(i);
		System.out.println(f);
		for(int c=2;c<10;c++) {
			
			 int s = i+f;
			 i=f;
			f = s;
			
			System.out.println(s);
		
			
		}
		
		
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
		int[] arr = {8,34,75,3,67,3,23,8,34};
		
		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		while(i < arr.length) {
			if(arr[i] != arr[j]) {
				System.out.println( arr[i]);
				j++;
			}
			i++;
			
		}
	}
}
