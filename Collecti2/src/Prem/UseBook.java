package Prem;

import java.util.ArrayList;
import java.util.Collections;

public class UseBook {

	public static void main(String[] args) {
		Book a=new Book(150,"suba",12.5f,"classmate");
		Book a1=new Book(167,"raka",22.5f,"note pad");
		Book a2=new Book(200,"nudhu",17.8f,"ideapad");
		Book a3=new Book(250,"suva",18.7f,"thinkpad");
		ArrayList<Book>b=new ArrayList<>();
		b.add(a);
		b.add(a1);
		b.add(a2);
		b.add(a3);
		Collections.sort(b);
//		for(Book f:b) {
//			System.out.println(f);
//		}
	    Collections.sort(b,new Book1());
	    for(Book f1:b) {
	    	System.out.println(f1);
	    }
			
		}
	}


