package Collect1mulit;

import java.util.HashMap;
import java.util.Iterator;

public class UseDomesticAnimal {

	public static void main(String[] args) {
	DomesticAnimal d1=new DomesticAnimal(15000,"dog","nan veg","female",12.5f);
	DomesticAnimal d2=new DomesticAnimal(16000,"cat","milk","male",15.5f);
	DomesticAnimal d3=new DomesticAnimal(18000,"rabate","natise","female",12.5f);
	
	HashMap<Float,DomesticAnimal>nails=new HashMap<>();
	nails.put(1.1f,d1);
	nails.put(2.3f,d2);
	nails.put(2.6f,d3);
	for(Float a:nails.keySet()) {
		System.out.println(a);
	}
	for(DomesticAnimal a1:nails.values()) {
		System.out.println(a1);
	}
	Iterator a=nails.keySet().iterator();
	while (a.hasNext()) {
		System.out.println(a.next());
	}
	Iterator a1=nails.values().iterator();
	while(a1.hasNext()) {
		System.out.println(a1.next());
	}
	nails.forEach((d,f)->System.out.println(d+","+f));
	}

}
