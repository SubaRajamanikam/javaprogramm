package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		 
//		HashSet<String>set=new HashSet<>();
		TreeSet<String>set=new TreeSet<>();
		
		set.add("jhon");
		set.add("jenie");
		set.add("jhon");
		set.add("jim");
		set.add("jack");
		set.add("abitha");
		set.add("jhon");
		set.add("kavin");
		set.add("joe");
		
		
		System.out.println("set is:"+set);
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		set.remove("jim");
		System.out.println("set after removing jim is:"+set);
		if(set.contains("jhon")) {
			System.out.println("jhon is in the set");
			
			
		}
	
	}

}
