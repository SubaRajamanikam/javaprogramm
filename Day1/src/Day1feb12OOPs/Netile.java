package Day1feb12OOPs;

public class Netile {
private int weight;
private float length;
public Netile(int weight, float length) {
	super();
	this.weight = weight;
	this.length = length;
}
public String toString() {
	return "Netile [weight=" + weight + ", length=" + length + "]";
}

public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}

}
