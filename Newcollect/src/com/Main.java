package com;

import java.util.ArrayList;
import java.util.Iterator;
class Student {
	int roll;
	String name;
}

public class Main {
	public static void main(String []args) {
		
		Student s=new Student();
		s.roll=10;
		s.name="mani";
		
		
		
//		li1 can only store String objects
		ArrayList<String>li1=new ArrayList<>();
		
//		li2 can only store any type of object
		ArrayList li2=new ArrayList();
		
//	    1.add data in list
		li1.add("suba");  //0
		li1.add("banana"); //1
		li1.add("thik");  //2
		li1.add("note");  //3
		 
//		1.add data in list
		li2.add("mano");
		li2.add(2);
		li2.add(2.2);
		li2.add(true);
		li2.add('k');
		
		
		System.out.println("li1 1st"+li1);
		System.out.println("li2 2st"+li2);
		
		String name=li1.get(2);
		System.out.println("name is:"+name);
		
		Object o=li2.get(2);
		System.out.println(" o is:"+name);
		
		li1.set(2, "mani");
		System.out.println("list1 now is:"+li1);
		
		li1.remove(2);
		System.out.println("list after remove is:"+li1);
		
		System.out.println("*******Iterating with for loop*********");
		if(li1.contains("note")) {
		System.out.println("note is in the li");
		}
		System.out.println("******");
		
		System.out.println("******Iterating with enhanced for loop*********");
		for(String str:li1) {
			System.out.println(str);
		}
		System.out.println("******");
		
		System.out.println("*****Iterating with Iterator*****");
		Iterator<String>itr=li1.iterator();
		/*System.out.println(itr.next());*/
		
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
			if(str.equals("suba")) {
				itr.remove();
				
			}
		}
		System.out.println("******");

		
		
		
	}

	 
}
