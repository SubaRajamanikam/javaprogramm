package Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
	Student s1=new Student(1,"hema","11th",1997);
	Student s2=new Student(2,"suba","12th",1998);
	Student s3=new Student(3,"asha","10th",1996);
	Student s4=new Student(4,"mani","9th",1999);
	ArrayList<Student>ss=new ArrayList();
	ss.add(s1);
	ss.add(s2);
	ss.add(s3);
	ss.add(s4);
	
	List<Student>sss=ss.stream().filter(r->r.setDop(s1)).collect(Collectors.toList());
	sss.forEach(z->System.out.println(z));
   
//	for(int i=0;i<ss.size();i++) {
//		System.out.println(ss.get(i));
//	}
//	for(Student t:ss) {
//		boolean isPrime=true;
//		for(int i=2;i<ss.size();i++) {
//		if(t.getDop()%i==0) {
//			isPrime=false;
//		}
//		}
//		if(isPrime) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}
//	}
//	ss.forEach(k->System.out.println(k));
//	
//	Iterator it=ss.iterator();
//    while (it.hasNext());
//	System.out.println(it.next());
	}

}
