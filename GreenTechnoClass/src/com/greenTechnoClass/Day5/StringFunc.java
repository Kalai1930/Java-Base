package com.greenTechnoClass.Day5;

public class StringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sample";
		System.out.println(s.length());

		String tolow = "KALAI";
		System.out.println(tolow.toLowerCase());
		
		String charat = "raj";
		System.out.println(charat.charAt(1));
		
		String a = "Hi";
		String b = "Hi";
		System.out.println(a.equals(b));
		System.out.println(a.concat(b));
		
		String	rep ="java";
		System.out.println(rep.replace('a', 'i'));
		System.out.println(rep.replaceFirst("a", "i"));
		
		String n="  ";
		System.out.println(n.isEmpty()); // empty will be true only there is even single space
		System.out.println(n.isBlank());
		
		String k ="dfg";
		String l = "dfg";
		System.out.println(k.concat(l));
	}

}
