package Day1feb12OOPs;

public class Ruberstic {
private String colour;
private String position;
private int price;
public Ruberstic(String colour, String position, int price) {
	super();
	this.colour = colour;
	this.position = position;
	this.price = price;
}
public String toString() {
	return "Ruberstic [colour=" + colour + ", position=" + position + ", price=" + price + "]";
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
