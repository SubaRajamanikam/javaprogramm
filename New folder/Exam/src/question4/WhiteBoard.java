package question4;

import java.util.Arrays;

public class WhiteBoard {
private String brand;
private float weight;
private int price;
private String material;
private Pin [] pin;
private Sheet sheet;
public WhiteBoard(String brand, float weight, int price, String material, Pin[] pin, Sheet sheet) {
	this.brand = brand;
	this.weight = weight;
	this.price = price;
	this.material = material;
	this.pin = pin;
	this.sheet = sheet;
}
public String toString() {
	return "WhiteBoard [brand=" + brand + ", weight=" + weight + ", price=" + price + ", material=" + material
			+ ", pin=" + Arrays.toString(pin) + ", sheet=" + sheet + "]";
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public Pin[] getPin() {
	return pin;
}
public void setPin(Pin[] pin) {
	this.pin = pin;
}
public Sheet getSheet() {
	return sheet;
}
public void setSheet(Sheet sheet) {
	this.sheet = sheet;
}

}
