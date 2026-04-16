package com.greenTechnoClass.WeekTests;


public class W2child extends W2AbsClass{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W2child ob = new W2child();	
		//ob.absMethod1();
		//ob.absMethod2();ob.nonAbsMethod();
		ob.poly();
		ob.poly(2);
		ob.poly(2, "Sun");
	}
	public void poly() {
		System.out.println("Polu method without parameter");
	}
	public void poly(int num) {
		System.out.println("Poly method with 1 param" + num);
	}
	public void poly(int n, String s) {
		System.out.println("Poly method with different param " + n + "and" + s);
	}
	@Override
	public void absMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method 1");	
	}
	@Override
	public void absMethod2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method 2");
	}	

}
class W2parent {
	
	public void test() {
		System.out.println("parent class");
	}

}

 abstract class W2AbsClass {
	public abstract void absMethod1();
	public abstract void absMethod2();
	
	public void nonAbsMethod() {
		System.out.println("Non Abstract Method");
	}
	
}
 




