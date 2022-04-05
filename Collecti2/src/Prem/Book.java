package Prem;

public class Book implements Comparable<Book> {
private int price;
private String name;
private float weight;
private String brand;
public Book(int price, String name, float weight, String brand) {
	this.price = price;
	this.name = name;
	this.weight = weight;
	this.brand = brand;
}

public String toString() {
	return "Book [price=" + price + ", name=" + name + ", weight=" + weight + ", brand=" + brand + "]";
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int compareTo(Book o) {

	return this.price-o.getPrice();
}
  

}
