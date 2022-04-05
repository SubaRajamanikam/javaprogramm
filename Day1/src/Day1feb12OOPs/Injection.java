package Day1feb12OOPs;

public class Injection {
private int price;
private String brand;
private float weight;
private Netile netile;
private Ruberstic [] ruberstic;
public Injection(int price, String brand, float weight, Netile netile, Ruberstic[] ruberstic) {
	super();
	this.price = price;
	this.brand = brand;
	this.weight = weight;
	this.netile = netile;
	this.ruberstic = ruberstic;
}
public String toString() {
	return "Injection [price=" + price + ", brand=" + brand + ", weight=" + weight + "]";
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
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
public Netile getNetile() {
	return netile;
}
public void setNetile(Netile netile) {
	this.netile = netile;
}
public Ruberstic[] getRuberstic() {
	return ruberstic;
}
public void setRuberstic(Ruberstic[] ruberstic) {
	this.ruberstic = ruberstic;
}

}
