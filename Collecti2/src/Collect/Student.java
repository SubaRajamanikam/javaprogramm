package Collect;

public class Student {
 private int id;
 private String name;
 private String classs;
 private Student dop;
public Student(int id, String name, String classs, int dop) {
	this.id = id;
	this.name = name;
	this.classs = classs;
	this.dop = dop;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClasss() {
	return classs;
}
public void setClasss(String classs) {
	this.classs = classs;
}
public int getDop() {
	return dop;
}
public void setDop(Student s1) {
	this.dop = s1;
}
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", classs=" + classs + ", dop=" + dop + "]";
}
 
 
}
