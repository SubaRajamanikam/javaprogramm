package question7;

import java.util.Arrays;

public class WaterMachine {
private String brand;
private int price;
private float height;
private WaterTampSwitch [] watertampswitch;
private WaterStorageSump waterstoragesump;
public WaterMachine(String band,int price,float height,WaterTampSwitch [] watertampswitch,WaterStorageSump waterstoragesump) {
	this.brand=brand;
	this.price=price;
	this.height=height;
	this.watertampswitch=watertampswitch;
	this.waterstoragesump=waterstoragesump;
}
public String toString() {
	return "WaterMachine [brand=" + brand + ", price=" + price + ", height=" + height + ", watertampswitch="
			+ Arrays.toString(watertampswitch) + ", waterstoragesump=" + waterstoragesump + "]";
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price=price;
}
public float getHeight() {
	return height;
}
public void setHieght(float height) {
	this.height=height;
}
public WaterTampSwitch []gteWatertamswitch(){
	return watertampswitch;
}
public void setWatertampswitch(WaterTampSwitch []watertampswitch) {
	this.watertampswitch=watertampswitch;
}
public WaterStorageSump getWaterstoragesump() {
	return waterstoragesump;
}
public void getWaterstoragesump(WaterStorageSump waterstoragesump) {
	this.waterstoragesump=waterstoragesump;
}
}
