package question4;

public class Sheet {
private String material;
private int lenght;
private int height;
private String colour;

public String toString() {
	return "Sheet [material=" + material + ", lenght=" + lenght + ", height=" + height + ", colour=" + colour + "]";
}
public Sheet(String material, int lenght, int height, String colour) {
	this.material = material;
	this.lenght = lenght;
	this.height = height;
	this.colour = colour;
}


public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}
public int getLenght() {
	return lenght;
}
public void setLenght(int lenght) {
	this.lenght = lenght;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}



}
