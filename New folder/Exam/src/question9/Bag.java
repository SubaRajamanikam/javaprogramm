package question9;

public class Bag {
private String brand;
private String material;
private int price;
private Zips []zips;
private LapHolder lapholder;
public Bag(String brand, String material, int price, Zips[] zips, LapHolder lapholder) {
	this.brand = brand;
	this.material = material;
	this.price = price;
	this.zips = zips;
	this.lapholder = lapholder;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Zips[] getZips() {
	return zips;
}
public void setZips(Zips[] zips) {
	this.zips = zips;
}
public LapHolder getLapholder() {
	return lapholder;
}
public void setLapholder(LapHolder lapholder) {
	this.lapholder = lapholder;
}

}
