package question2;

public class Woofer {
	private String material;
	private float weight;
	private int price;
	public Woofer (String material,float weight,int price) {
		this.material=material;
		this.weight=weight;
		this.price=price;
		
	}
	public String toString() {
		return "Woofer [material=" + material + ", weight=" + weight + ", price=" + price + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
