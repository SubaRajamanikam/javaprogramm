package Collect2;

import java.util.HashMap;
import java.util.Iterator;

public class UseElerticlaShop {

	public static void main(String[] args) {
		ElerticlaShop e1=new ElerticlaShop("wireharrens",125,10,150);
		ElerticlaShop e2=new ElerticlaShop("wireharrens",165,10,150);
        ElerticlaShop e3=new ElerticlaShop("wireharrens",185,10,150);
        
        HashMap<String,ElerticlaShop>es=new HashMap<>();
        es.put("s1", e1);
        es.put("s2", e2);
        es.put("s3", e3);
        for(String a:es.keySet()) {
        	System.out.println(a);
        }
        for(ElerticlaShop a1:es.values()) {
        	System.out.println(a1);
        }
        Iterator a=es.keySet().iterator();
        while(a.hasNext()) {
        	System.out.println(a.next());
        }
        Iterator a1=es.values().iterator();
        while (a1.hasNext()) {
        	System.out.println(a1.next());
        }
        es.forEach((d,z)->System.out.println(d+","+z));
	}

}
