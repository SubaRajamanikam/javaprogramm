package question5;

public class Legs {
private String material;
private String position;
private int height;

public String toString() {
	return "Legs [material=" + material + ", position=" + position + ", height=" + height + "]";
}

public Legs(String material, String position, int height) {
	this.material = material;
	this.position = position;
	this.height = height;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

}
