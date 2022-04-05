package Collect1mulit;

import java.util.HashMap;
import java.util.Iterator;

public class Keyvalue {

	public static void main(String[] args) {
	HashMap<String,Float>ns=new HashMap<>();
	ns.put("suba",23.6f);
	ns.put("hema",26.8f);
	ns.put("mano",55.6f);
	ns.put("asha",28.9f);
	ns.put("prem",29.3f);
	for(String s:ns.keySet()) {
		System.out.println(s);
	}
	for(Float s1:ns.values()) {
		System.out.println(s1);
	}
    Iterator s=ns.keySet().iterator();
    while(s.hasNext()) {
    	System.out.println(s.next());
    }
    Iterator s1=ns.values().iterator();
    while(s.hasNext()) {
    	System.out.println(s.next());
    }
    ns.forEach((a,c)->System.out.println(a+","+c));
	}

}
