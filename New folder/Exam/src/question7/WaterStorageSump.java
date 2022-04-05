package question7;

public class WaterStorageSump {
private String material;
private String  storagelevel;
private int price; 
public WaterStorageSump(String material,String storagelevel,int price) {
	this.material=material;
	this.storagelevel=storagelevel;
	this.price=price;
}
public String toString() {
	return "WaterStorageSump [material=" + material + ", storagelevel=" + storagelevel + ", price=" + price + "]";
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material=material;
}
public String getStoragelevel() {
	return storagelevel;
}
public void setStoragelevel(String storagelevel) {
	this.storagelevel=storagelevel;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price=price;
}
}
