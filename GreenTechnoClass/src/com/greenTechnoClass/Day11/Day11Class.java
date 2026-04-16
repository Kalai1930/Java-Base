package com.greenTechnoClass.Day11;

public class Day11Class {
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	
public static void main(String[] args) {
	
	int add = add(12,34);
	System.out.println(add);
		
	int sub = sub(34,12);
	System.out.println(sub);
	int mul = mul(6,12);
	System.out.println(mul);
	int div = div(36,12);
	System.out.println(div);
	}

}
