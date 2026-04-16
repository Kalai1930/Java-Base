package com.greenTechnoClass.Day8;

public class AccessSpecifiers {
	
	private void print() {
		System.out.println("print");
	}
	 
	protected void inherit() {
		System.out.println("protect");
	}

}

class A extends AccessSpecifiers{
	
	public static void main(String args[]) {
		AccessSpecifiers obj = new AccessSpecifiers();
	// private can't be access out of its own class.
	// so we will get error the print method can't be accessible
	//obj.print();
	 obj.inherit();
	}
}