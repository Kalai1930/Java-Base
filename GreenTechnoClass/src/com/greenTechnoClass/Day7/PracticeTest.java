package com.greenTechnoClass.Day7;

public class PracticeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeTest obj= new PracticeTest();
		obj.TriangleStar();
		obj.revTriangleStar();
		obj.leftTriStar();
		obj.revLeftTriStar();	
		}
	public void TriangleStar() {
		for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print("*"); 
				  }
			System.out.println();
		}
	}
	public void revTriangleStar() {
		for(int i=5;i>=1;i--) {
			  for(int j=i;j>=1;j--) {
				  System.out.print("*"); 
				  }
			System.out.println();
		}
	}
	public void leftTriStar() {

		for(int i=1;i<=5;i++) {
			  for(int j=i;j<5;j++) {
				  System.out.print(" "); 
				  }
			 for(int k=1;k<=i;k++) {
				  System.out.print("*");
			  }
			System.out.println();
		}
	}
	public void revLeftTriStar() {
		for(int i=5;i>=1;i--) {
			 for(int j=i;j<5;j++) {
				 System.out.print(" ");
			 } 
			  for(int k=i;k>=1;k--) {
				  System.out.print("*"); 
				  }
			System.out.println();
		}
	}

}
