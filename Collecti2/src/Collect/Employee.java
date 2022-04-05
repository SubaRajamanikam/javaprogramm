package Collect;

public class Employee {
private String name;
private int salary;
private String gender;


public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
}

public Employee(String name, int salary, String gender) {
	this.name = name;
	this.salary = salary;
	this.gender = gender;
	//this.tax = tax;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

int  gettax() {
	if((this.salary>20000)&&(this.salary<30000)) {
		return 0;
	}

	else if ((this.salary>30000)&&(this.salary<50000)) {
		int a=this.salary*5/100;
		return a;
	}
	else if(this.salary>50000) {
		int b=this.salary*10/100;
		return b;
	}
	else {
		return 0;
	}
		
		
		
	
		
		
		
	

}
}
