package Day1feb12OOPs;

public class Board {
 private int price;
 private String brand;
 private int weight;
 private Backboard back;
 private Blot []blot;
 
 public void setBrand(String brand) {
		this.brand = brand;
	}
public String getBrand() {
	return this.brand;
}
public void setPrice(int price) {
	this.price = price;
}
public int getPrice() {
	return this.price;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getWeight() {
	return this.weight;
}
public void setBack(Backboard back) {
	this.back = back;
}
public Backboard getBack() {
	return this.back;
}
public void setBlot(Blot[] blot) {
	this.blot = blot;
}
public Blot[] getBlot() {
	return this.blot;
}


}


