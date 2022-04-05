package question6;

import java.util.Arrays;

public class Door {
private String brand;
private int weight;
private int price;
private String material;
private Lock []lock;
private Stopper stopper;
public Door(String brand, int weight, int price, String material, Lock[] lock, Stopper stopper) {
	this.brand = brand;
	this.weight = weight;
	this.price = price;
	this.material = material;
	this.lock = lock;
	this.stopper = stopper;
}
public String toString() {
	return "Door [brand=" + brand + ", weight=" + weight + ", price=" + price + ", material=" + material + ", lock="
			+ Arrays.toString(lock) + ", stopper=" + stopper + "]";
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
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
public Lock[] getLock() {
	return lock;
}
public void setLock(Lock[] lock) {
	this.lock = lock;
}
public Stopper getStopper() {
	return stopper;
}
public void setStopper(Stopper stopper) {
	this.stopper = stopper;
}



}
