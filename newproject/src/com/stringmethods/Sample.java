package com.stringmethods;

public class Sample {

	public static void main(String[] args) {
		 
		
		StringBuffer a=new StringBuffer("Edureka");
		a.append("!!");
		a.insert(0, 'w');
		a.replace(0, 2, "hi");
		a.delete(0, 1);
		
		System.out.println(a.reverse());
		System.out.println(a.capacity());
		System.out.println(a);

	}

}
