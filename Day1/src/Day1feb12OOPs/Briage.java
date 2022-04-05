package Day1feb12OOPs;


import java.util.Arrays;

public class Briage {
 private int price;
 private String brand;
 private Door door;
 private Rack [] rack;
 
//public String toString() {
//	return "price=" + price + ", brand=" + brand + ", door=" + door + ", rack=" + Arrays.toString(rack);
//}
//public Briage(int price, String brand, Door door, Rack[] rack) {
//	this.price = price;
//	this.brand = brand;
//	this.door = door;
//	this.rack = rack;
//}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Door getDoor() {
	return door;
}
public void setDoor(Door door) {
	this.door = door;
}
public Rack [] getRack() {
	return rack;
}
public void setRack(Rack [] rack) {
	this.rack = rack;
}
 
}
