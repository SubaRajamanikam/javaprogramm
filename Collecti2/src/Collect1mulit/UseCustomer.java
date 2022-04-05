package Collect1mulit;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {

	public static void main(String[] args) {
	Customer c1=new Customer(12,"nudhue","female",26);
	Customer c2=new Customer(15,"kalai","male",28);
	Customer c3=new Customer(13,"barthi","female",30);
	Customer c4=new Customer(16,"vicke","male",25);
	HashMap<String,Customer>hs=new HashMap<>();
     hs.put("a12", c1);
     hs.put("l16", c2);
     hs.put("b19", c3);
     hs.put("a15", c4);
     for(String s:hs.keySet()) {
    	 System.out.println(s);
     }
     for(Customer s1:hs.values()) {
    	 System.out.println(s1);
     }
     Iterator s=hs.keySet().iterator();
     while(s.hasNext()) {
    	 System.out.println(s.next());
     }
     Iterator s1=hs.keySet().iterator();
     while(s1.hasNext()) {
    	 System.out.println(s1.next());
     }
     hs.forEach((f,g)->System.out.println(f+","+g));
	}

}
