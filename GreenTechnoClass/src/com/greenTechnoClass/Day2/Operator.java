package com.greenTechnoClass.Day2;

public class Operator {
	
	public static void main(String[] args) {
		
		
	int a = 100;
	int b = 90;
	
	//arithmetic operator
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a*b);
	System.out.println(a%b);
	
	
	//increament
	int c =9;
	c++;
	System.out.println(c);
	
	
	//decrement
	int d= 6;
	d--;
	System.out.println(d);
	
	//assignment operator
	int e=90;
	a +=8;
	System.out.println(e);
	
	int f=78;
	 f -=8;
	 System.out.println(f);
	 
	 int g=10;
	 g *=10;
	 System.out.println(g);
	 
	 int h=11;
	 h /=11;
	 System.out.println(h);
	 
	 int i=10;
	 i %=5;
	 System.out.println(i);
	
	 //Comparison operator
	 
	 System.out.println(a<b);
	 System.out.println(a>b);
	 System.out.println(a<=b);
	 System.out.println(a>=b);
	 System.out.println(a==b);
	 System.out.println(a!=b);
	
	 //Logical operator
	 System.out.println((a>b) && (a>=b));
	 System.out.println((a<b) && (a>b));
	 System.out.println((a<b) || (a>b));
	 System.out.println(!((a<b) || (a>b)));
	
	}
}
