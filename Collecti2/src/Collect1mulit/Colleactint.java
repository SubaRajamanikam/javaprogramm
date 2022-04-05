package Collect1mulit;

import java.util.HashMap;
import java.util.Iterator;

public class Colleactint {

	public static void main(String[] args) {
	HashMap<Integer,Integer>na=new HashMap<>();
	na.put(12, 23);
	na.put(13, 24);
	na.put(14, 33);
	na.put(15, 43);
	na.put(22, 55);
	for(Integer a:na.keySet()) {
		System.out.println(a);
	}
	for(Integer e:na.values()) {
		System.out.println(e);
	}
	Iterator a=na.keySet().iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}
	Iterator e=na.values().iterator();
	while(e.hasNext()) {
		System.out.println(e.next());
	}
	na.forEach((s,x)->System.out.println(s+","+x));
	}

}
