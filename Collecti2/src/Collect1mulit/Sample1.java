package Collect1mulit;

import java.util.HashMap;
import java.util.Iterator;

public class Sample1 {

	public static void main(String[] args) {
	HashMap<Integer,String>ni=new HashMap<>();
	ni.put(11,"hama");
	ni.put(12,"asha");
	ni.put(13, "Suba");
	ni.put(15,"lavanaya");
	 for(Integer a:ni.keySet()) {
		System.out.println(a);
	 }
	 for(String a:ni.values()) {
		 System.out.println(a);
	 }
	 Iterator a=ni.keySet().iterator();
     while(a.hasNext()) {
    	 System.out.println(a.next());
     }
     Iterator e=ni.values().iterator();
     while(a.hasNext()) {
    	 System.out.println(a.next());
     }
	 ni.forEach((k,v)->System.out.println(k+","+v));
    
	 
	}

}
