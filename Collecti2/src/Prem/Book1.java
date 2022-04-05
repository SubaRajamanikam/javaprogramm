package Prem;

import java.util.Comparator;

public class Book1 implements Comparator <Book> {

	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}


}
