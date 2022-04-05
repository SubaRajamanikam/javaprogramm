package Day2feb12Encapuslation;

import java.util.Arrays;

public class College {
private int id;
private String name;
private Address address;
private Course []course;
private Universtie universtie;
public College(int id,String name,Address address,Course [] course,Universtie universtie) {
	this.id=id;
	this.name=name;
	this.address=address;
	this.course=course;
	this.universtie=universtie;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address=address;
}
public Course [] getCourse() {
	return course;
}
public void setCourse(Course[] course) {
	this.course=course;
}
public Universtie getUniverstie() {
	return universtie;
}
public void setUniverstie(Universtie universtie) {
	this.universtie=universtie;
}
@Override
public String toString() {
	return "College [id=" + id + ", name=" + name + ", address=" + address + ", course=" + Arrays.toString(course)
			+ ", universtie=" + universtie + "]";
}


}
