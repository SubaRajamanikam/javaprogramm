package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
    ArrayList<Integer>li=new ArrayList<>();
    li.add(235);
    li.add(23);
    li.add(27);
    li.add(25);
    for(int i=0;i<li.size();i++) {
    	System.out.println(li.get(i));
    }
    for(Integer s:li) {
	   if(s>30) {
		   System.out.println(s);
   }
   }
	Iterator itr=li.iterator();
    while(itr.hasNext()) {
	System.out.println(itr.next());
   }
    li.forEach(k->System.out.println(k));
   }

}
