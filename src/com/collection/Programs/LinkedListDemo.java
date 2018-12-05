package com.collection.Programs;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("A");
	l.add("B");
	l.add(1);
	l.add(null);
	l.add("B");
	System.out.println(l);
	
	l.remove(1);
	System.out.println(l);
	
	l.add(0,"Sampada");
	System.out.println(l);
	
	l.set(2, "Ganpati");
	System.out.println(l);
	
	l.addLast("How");
	l.addFirst("Why");
	System.out.println(l);
	
	l.removeFirst();
	System.out.println(l);
	
}
}
