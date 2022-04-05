package question8;

public class Compartment {
private float length;
private int id;
private String position;
public Compartment(float length, int id, String position) {
	this.length = length;
	this.id = id;
	this.position = position;
}
public String toString() {
	return "Compartment [length=" + length + ", id=" + id + ", position=" + position + "]";
}
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}

}
