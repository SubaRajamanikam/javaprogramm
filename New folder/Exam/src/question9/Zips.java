package question9;

public class Zips {
private String position;
private String material;
private int weight;
public Zips(String position, String material, int weight) {
	this.position = position;
	this.material = material;
	this.weight = weight;
}
public String toString() {
	return "Zips [position=" + position + ", material=" + material + ", weight=" + weight + "]";
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}

}
