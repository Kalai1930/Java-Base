package com.greenTechnoClass.Day7;

public class Kotack implements Banking{

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("current");
		
	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("savings");
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary");
	}

	public static void main(String[] args) {
		Kotack obj = new Kotack(); 
		obj.current();
		obj.salary();
		obj.savings();
	}

}
