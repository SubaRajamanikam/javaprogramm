package Collect;

import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {
	ArrayList<String>bi=new ArrayList<>();
	bi.add("Suba");
	bi.add("mano");
	bi.add("asha");
	bi.add("punitha");
	for(int i=0;i<bi.size();i++) {
		System.out.println(bi.get(i));
	 }
     for(String s:bi) {
     
	 System.out.println(s.toUpperCase());
     }
    bi.forEach(k->System.out.println(k));
	}

}
