package question5;

public class Seat {
private String material;
private boolean isQuality;
private boolean isAdjustuable;
public Seat(String material, boolean isQuality, boolean isAdjustuable) {
	this.material = material;
	this.isQuality = isQuality;
	this.isAdjustuable = isAdjustuable;
}
public String toString() {
	return "Seat [material=" + material + ", isQuality=" + isQuality + ", isAdjustuable=" + isAdjustuable + "]";
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public boolean isQuality() {
	return isQuality;
}
public void setQuality(boolean isQuality) {
	this.isQuality = isQuality;
}
public boolean isAdjustuable() {
	return isAdjustuable;
}
public void setAdjustuable(boolean isAdjustuable) {
	this.isAdjustuable = isAdjustuable;
}

}
