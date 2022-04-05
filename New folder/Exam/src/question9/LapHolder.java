package question9;

public class LapHolder {
private int length;
private float height;
private boolean iaquality;
public LapHolder(int length, float height, boolean iaquality) {
	this.length = length;
	this.height = height;
	this.iaquality = iaquality;
}
public String toString() {
	return "LapHolder [length=" + length + ", height=" + height + ", iaquality=" + iaquality + "]";
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public boolean isIaquality() {
	return iaquality;
}
public void setIaquality(boolean iaquality) {
	this.iaquality = iaquality;
}

}
