package Dayfeb1arredtion;

public class UseStudent {
public static void main (String args[]) {
	Student s=new Student();
	s.rollno=234;
	s.name="soni";
	s.section='a';
	Subject d=new Subject();
	d.book="tamil";
	d.days=23;
	d.s=s;
	Subject d1=new Subject();
	d1.book="english";
	d1.days=33;
	d1.s=s;
	System.out.println(d.book+","+d.days+","+s.rollno+","+s.name+","+s.section);
	System.out.println(d1.book+","+d1.days+","+s.rollno+","+s.name+","+s.section);
}


}
