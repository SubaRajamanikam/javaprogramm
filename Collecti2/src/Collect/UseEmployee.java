package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("asha",20000,"female");
		Employee e2=new Employee("mani",30000,"male");
		Employee e3=new Employee("barthai",50000,"male");
		ArrayList<Employee>e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		
		for(int i=0;i<e.size();i++) {
		System.out.println(e.get(i).gettax());
//		}
//		for(Employee y:e) {
//			System.out.println(y);
//		}
//		Iterator it=e.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		e.forEach(k->System.out.println(k));
		
		}

	}
}
