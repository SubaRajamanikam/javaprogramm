package question3;

public class LeadActor {
private String name;
private int salary;
private boolean ismaritalstatus;
public LeadActor(String name,int salary, boolean ismaritalstatus) {
	this.name = name;
	this.salary = salary;
	this.ismaritalstatus = ismaritalstatus;
}
public String toString() {
	return "LeadActor [name=" + name + ", salary=" + salary + ", ismaritalstatus=" + ismaritalstatus + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public boolean isIsmaritalstatus() {
	return ismaritalstatus;
}
public void setIsmaritalstatus(boolean ismaritalstatus) {
	this.ismaritalstatus = ismaritalstatus;
}

}
