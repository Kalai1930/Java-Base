package com.greenTechnoClass.Day5;

public class StringBufferFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("all");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hlo");
		sb1.insert(1, "el");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Heelo");
		sb2.replace(1, 3, "el");
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Heeello");
		sb3.delete(1,3);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("olleh");
		sb4.reverse();
		System.out.println(sb4);

	}

}
