package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample2 {

	public static void main(String[] args) {
	ArrayList<Float>ai=new ArrayList<>();
	ai.add(23.6f);
	ai.add(12.5f);
	ai.add(29.4f);
	ai.add(15.6f);
	
	for(int i=0;i<ai.size();i++) {
		System.out.println(ai.get(i));
	}
	for(Float a:ai) {
		if(a<12.4f) {
			System.out.println(a);
		}
	}
 ai.forEach(k->System.out.println(k));
   Iterator it=ai.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
		
	
	}

}
