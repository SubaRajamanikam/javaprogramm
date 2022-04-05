package Day1feb12OOPs;

public class Pin {
private int weight;
private int price;
public Pin(int weight, int price) {
	this.weight = weight;
	this.price = price;
}
public String toString() {
	return "Pin [weight=" + weight + ", price=" + price + "]";
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

}
