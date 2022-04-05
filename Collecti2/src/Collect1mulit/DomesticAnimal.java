package Collect1mulit;

public class DomesticAnimal {
private int price;
private String name;
private String food;
private String gender;
private float weight;
public DomesticAnimal(int price, String name, String food, String gender, float weight) {
	this.price = price;
	this.name = name;
	this.food = food;
	this.gender = gender;
	this.weight = weight;
}
public String toString() {
	return "DomesticAnimal [price=" + price + ", name=" + name + ", food=" + food + ", gender=" + gender + ", weight="
			+ weight + "]";
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
public String getFood() {
	return food;
}
public void setFood(String food) {
	this.food = food;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}


}
