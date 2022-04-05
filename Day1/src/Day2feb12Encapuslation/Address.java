package Day2feb12Encapuslation;

public class Address {
private int doorno;
private String student;
private String city;
private String districk;
private int pin;
public Address(int doorno,String student,String city,String districk,int pin) {
	this.doorno=doorno;
	this.student=student;
	this.city=city;
	this.districk=districk;
	this.pin=pin;
	}
public String toString() {
	return "Address [doorno=" + doorno + ", student=" + student + ", city=" + city + ", districk=" + districk + ", pin="
			+ pin + "]";
}
public int getDoorno() {
	return doorno;
}
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrick() {
	return districk;
}
public void setDistrick(String districk) {
	this.districk = districk;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}

}
