package Day2feb12Encapuslation;

public class Course {
 private String coursename;
 private int noofyear;
public Course(String coursename, int noofyear) {
	super();
	this.coursename = coursename;
	this.noofyear = noofyear;
}
public String toString() {
	return "Course [coursename=" + coursename + ", noofyear=" + noofyear + "]";
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public int getNoofyear() {
	return noofyear;
}
public void setNoofyear(int noofyear) {
	this.noofyear = noofyear;
}
 
}
