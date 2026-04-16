package com.greenTechnoClass.Day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj = new ArrayList();
		obj.add("pink");
		obj.add("blue");
		obj.add("Red");
		obj.add(12);
		obj.add(true);
		obj.add('R');
		obj.add(23.3f);
		
		//which changes the value of the index 0 from pink to white
		obj.set(0,"white");
		
		//to remove the value from list using index
		obj.remove(1);
		
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.size());
		//to check the value/object exist in the list
		System.out.println(obj.contains("Red"));
		
		//ArrayList using generics will help for validations
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("food");
		arr.add("fruits");
		arr.add("juice");
		
		System.out.println(arr);
		
		//fast editing comparing to array list
		LinkedList<String> larr = new LinkedList<String>();
		larr.add("kalai");
		larr.add("Mani");
		larr.add("mehanth");
		larr.add("bharathi");
		
		larr.addFirst("bharathi");
		larr.addLast("nagarajan");
		
		larr.removeFirst();
		larr.removeLast();
		
		System.out.println(larr);
		System.out.println(larr.getFirst());
		System.out.println(larr.getLast());
		
		
		Vector<String> vec = new Vector<String>();
		vec.add("pink");
		vec.add("stri");
	}

}