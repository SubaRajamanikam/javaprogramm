package question3;

public class SupportingActor {
private String name;
private String role;
private int salary;
public SupportingActor (String name,String role,int salary) {
	this.name=name;
	this.role=role;
	this.salary=salary;
}
public String toString() {
	return "SupportingActor [name=" + name + ", role=" + role + ", salary=" + salary + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role=role;
}
public int getSalary() {
	return salary;
	
}
public void setSalary(int salary) {
	this.salary=salary;
}
}
