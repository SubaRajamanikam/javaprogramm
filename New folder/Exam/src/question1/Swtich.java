package question1;

public class Swtich {
private String material;
private String brand;
private float weight;
public Swtich(String material,String brand,float weight) {
	this.material=material;
	this.brand=brand;
	this.weight=weight;
}
public String toString() {
	return "Swtich [material=" + material + ", brand=" + brand + ", weight=" + weight + "]";
}


public String getMaterial() {
	return material;
}
public void setmaterial(String amterial) {
	this.material=material;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weigth) {
	this.weight=weight;
}

}
