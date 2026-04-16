package com.greenTechnoClass.PracticeProblems;

//Sum of two arrays
public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{2,3,4,5,6,5},{3,4,5,6,3,5}};
		int[][] arr1 = {{1,3,4,5,3,5},{2,5,6,7,3,3}};
		//System.out.println(arr.length);
		
		System.out.println("Array1: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Array2: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Sum of two arrays: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+(arr[i][j]+arr1[i][j]));
			}
			System.out.println();
		}
		

	}

}
