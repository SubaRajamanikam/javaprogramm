package question6;

public class Lock {
private String position;
private String typr;
private String brand;
public Lock(String position, String typr, String brand) {
	this.position = position;
	this.typr = typr;
	this.brand = brand;
}
public String toString() {
	return "Lock [position=" + position + ", typr=" + typr + ", brand=" + brand + "]";
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getTypr() {
	return typr;
}
public void setTypr(String typr) {
	this.typr = typr;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

}
