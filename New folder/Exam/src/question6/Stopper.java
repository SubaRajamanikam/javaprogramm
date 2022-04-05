package question6;

public class Stopper {
private String material;
private int height;
private String brand;
public Stopper(String material, int height, String brand) {
	this.material = material;
	this.height = height;
	this.brand = brand;
}
public String toString() {
	return "Stopper [material=" + material + ", height=" + height + ", brand=" + brand + "]";
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

}
