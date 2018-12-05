package com.collection.Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		//ArrayList l= new ArrayList();
		ArrayList<String> l=new ArrayList<>();
		
	
		l.add("Sampada");
		l.add("Patil");
		//l.add(7057);
		l.add(null);

		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		
		l.add(1,"Ganpati");
		System.out.println(l);
		
		l.add("Suman");
		l.add("Saroja");
		l.add("Suraj");
		System.out.println(l);
		
		l.set(3, "MY FAMILY");
		System.out.println(l);
		System.out.println(l.get(1));
		
		
		
	}
}
