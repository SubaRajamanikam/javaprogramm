package question2;

import java.util.Arrays;

public class HomeTheater {
private int id;
private String brand;
private String type;
private int price;
private Speaker [] speaker;
private Woofer woofer;
public HomeTheater(int id,String brand,String type,int price,Speaker []speaker,Woofer woofer) {
	this.id=id;
	this.brand=brand;
	this.type=type;
	this.price=price;
	this.speaker=speaker;
	this.woofer=woofer;
}	
public String toString() {
	return "HomeTheater [id=" + id + ", brand=" + brand + ", type=" + type + ", price=" + price + ", speaker="
			+ Arrays.toString(speaker) + ", woofer=" + woofer + "]";
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Speaker[] getSpeaker() {
	return speaker;
}
public void setSpeaker(Speaker[] speaker) {
	this.speaker = speaker;
}
public Woofer getWoofer() {
	return woofer;
}
public void setWoofer(Woofer woofer) {
	this.woofer = woofer;
}


}
