package Day2feb12Encapusation3;

public class Address {
private int doorno;
private String street;
private String city;
private String pin;
public Address(int doorno, String street, String city, String pin) {
	super();
	this.doorno = doorno;
	this.street = street;
	this.city = city;
	this.pin = pin;
}
public String toString() {
	return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
}
public int getDoorno() {
	return doorno;
}
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}

}
