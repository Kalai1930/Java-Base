package com.greenTechnoClass.Day10;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class CMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print random order
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("uk", "london");
		hm.put("india", "delhi");
		hm.put("japan", "tokyo");
		hm.put("usa", "london");
		
		System.out.println(hm);
		
		hm.replace("usa", "texas");
		System.out.println(hm);
		
		hm.remove("usa");
		System.out.println(hm);
		System.out.println(hm.get("india"));
		
		//print the output in the given order
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("uk", "london");
		lhm.put("india", "delhi");
		lhm.put("japan", "tokyo");
		lhm.put("usa", "london");
		
		System.out.println(lhm);
		
		//output will give the key in ascending order.
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Goa");
		tm.put(11, "Bangalore");
		tm.put(9, "Mumbai");
		tm.put(2, "Kashmir");
		
		System.out.println(tm);
		
		//last in first out
		Stack<Integer> s = new Stack<Integer>();
		s.push(20);
		s.push(10);
		s.push(5);
		s.push(50);
		s.pop();
		System.out.println(s.peek()); //to get the first val in the stack
		System.out.println(s);
		
		//First in first out 
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(20);
		q.add(30);
		q.add(50);
		q.add(70);
		q.poll(); //to remove val
		
		System.out.println(q);
		
		
		//will work based on the priority
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(30);
		pq.add(50);
		pq.add(70);
		pq.poll(); //will remove the least priority or least value
		System.out.println(pq);
		
		//works faster than the Linked list
		Queue<Integer> qd = new ArrayDeque<Integer>();
		qd.add(20);
		qd.add(30);
		qd.add(50);
		qd.add(70);
		qd.poll();
		System.out.println(qd);
	}

}
