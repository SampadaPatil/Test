package com.collection.Programs;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("A");
	h.add("S");
	h.add("B");
	h.add("sam");
	h.add("C");
	h.add("Z");
	h.add(90);
	h.add(null);
	h.add(70);
	System.out.println((h.add("Z")));
	System.out.println(h);
	
		
}
}
