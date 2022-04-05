package Collect;

import java.util.ArrayList;

public class Sample5 {

	public static void main(String[] args) {
	 ArrayList<Character>ai=new ArrayList<>();
	 ai.add('a');
	 ai.add('b');
	 ai.add('c');
	 ai.add('d');
	 ai.add(null);
	 for(int i=0;i<ai.size()-1;i++) {
		 if(ai.get(i)!=null) {
		 System.out.println(ai.get(i));
		 break;
	 }
	 }
	}

}
