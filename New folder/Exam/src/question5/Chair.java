package question5;

import java.util.Arrays;

public class Chair {
private String brand;
private int price;
private boolean iscushion;
private Legs []legs;
private Seat seat;
public Chair(String brand, int price, boolean iscushion, Legs[] legs, Seat seat) {
	this.brand = brand;
	this.price = price;
	this.iscushion = iscushion;
	this.legs = legs;
	this.seat = seat;
}
public String toString() {
	return "Chair [brand=" + brand + ", price=" + price + ", iscushion=" + iscushion + ", legs=" + Arrays.toString(legs)
			+ ", seat=" + seat + "]";
}


public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isIscushion() {
	return iscushion;
}
public void setIscushion(boolean iscushion) {
	this.iscushion = iscushion;
}
public Legs[] getLegs() {
	return legs;
}
public void setLegs(Legs[] legs) {
	this.legs = legs;
}
public Seat getSeat() {
	return seat;
}
public void setSeat(Seat seat) {
	this.seat = seat;
}


}
