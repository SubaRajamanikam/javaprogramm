package question7;

public class WaterTampSwitch {
private String type;
private String material;
private String shape;
public WaterTampSwitch(String type,String material,String shape) {
	this.type=type;
	this.material=material;
	this.shape=shape;
}
public String toString() {
	return "WaterTampSwitch [type=" + type + ", material=" + material + ", shape=" + shape + "]";
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type=type;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material=material;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape=shape;
}

}
