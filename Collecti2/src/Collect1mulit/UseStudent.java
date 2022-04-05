package Collect1mulit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
	Student s1=new Student(100,"asha","female",23);
	Student s2=new Student(90,"hema","female",22);
	Student s3=new Student(89,"nithay","male",24);
	Student s4=new Student(101,"anglie","female",25);
	ArrayList<Student>students=new ArrayList<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	
    List<Student>stud=students.stream().filter(b->b.getGender().endsWith("male")).collect(Collectors.toList());
    stud.forEach(k->System.out.println(k));
    Long s=students.stream().filter(c->c.getGender().equals("female")).count();
    System.out.println(s);
    List<Boolean>dads=students.stream().map(f->f.getName().startsWith("hema")).collect(Collectors.toList());
    dads.forEach(h->System.out.println(h));
    List<String>da=students.stream().map(v->v.getName().toLowerCase()).collect(Collectors.toList());
    da.forEach(z->System.out.println(z));
    List<String>das=students.stream().map(o->o.getName().toUpperCase()).collect(Collectors.toList());
    das.forEach(p->System.out.println(p));
	}
}
