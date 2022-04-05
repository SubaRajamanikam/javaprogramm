package question2;

public class Speaker {
	private String material;
	private String brand;
	private float weight;
	public Speaker(String material, String brand, float weight) {
		this.material = material;
		this.brand = brand;
		this.weight = weight;
	}
	public String toString() {
		return "Speaker [material=" + material + ", brand=" + brand + ", weight=" + weight + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
