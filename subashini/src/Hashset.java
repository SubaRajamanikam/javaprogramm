import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
	HashSet<String> li = new HashSet<String>();
	li.add("bhara");
	li.add("david");
	li.add("david");
	
	Iterator<String> a = li.iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}
	long b = li.stream().filter(c->c.startsWith("d")).count();
	System.out.println(b);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	}

}
