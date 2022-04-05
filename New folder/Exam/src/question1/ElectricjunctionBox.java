package question1;

import java.util.Arrays;

public class ElectricjunctionBox {
private String id;
private String brand;
private int voltage;
private int price;
private Swtich [] swtichs;
private Cover cover;
public ElectricjunctionBox(String id, String brand, int voltage, int price,Swtich [] swtichs, Cover cover) {
	this.id = id;
	this.brand = brand;
	this.voltage = voltage;
	this.price = price;
	this.swtichs=swtichs;
	this.cover = cover;
}
public String toString() {
	return "ElectricjunctionBox [id=" + id + ", brand=" + brand + ", voltage=" + voltage + ", price=" + price
			+ ", swtichs=" + Arrays.toString(swtichs) + ", cover=" + cover + "]";
}



public String getId() {
	return id;
}
public void setId(String id) {
	this.id=id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public int getVoltaage() {
	return voltage;
}
public void setVoltage(int voltage) {
	this.voltage=voltage;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price=price;
}
public Swtich [] getSwtichs() {
	return swtichs;
}
public void setSwtichs(Swtich []swtichs) {
	this.swtichs=swtichs;
}
public Cover getCover() {
	return cover;
}
public void setCover(Cover cover) {
	this.cover=cover;
	
}
}