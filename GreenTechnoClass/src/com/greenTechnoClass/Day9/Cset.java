package com.greenTechnoClass.Day9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Cset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set won't allow duplicates and doesn't support editing.
		//set will print the values randomly
		HashSet<String> sobj = new HashSet<String>();
		sobj.add("yellow");
		sobj.add("blue");
		sobj.add("orange");
		sobj.add("purple");
		sobj.add("white");
		
		
		sobj.remove("white");
		System.out.println(sobj);
		System.out.println(sobj.contains("purple"));
		
		//set will print the values in order. its a mixture of LinkedList and Hashset
		LinkedHashSet<String> lsobj = new LinkedHashSet<String>();
				lsobj.add("yellow");
				lsobj.add("blue");
				lsobj.add("orange");
				lsobj.add("purple");
				lsobj.add("white");
				
				
				lsobj.remove("white");
				System.out.println(lsobj);
				System.out.println(lsobj.contains("purple"));
				
		//won't save the duplicates it will ignore
		//prints the value in ascending
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(2);
		tset.add(8);
		tset.add(4);
		tset.add(9);
		tset.add(1);
		tset.add(1);
		
		System.out.println(tset);
	}

}
