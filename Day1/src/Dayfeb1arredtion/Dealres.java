package Dayfeb1arredtion;

public class Dealres {
		
	private int value;
	private String brand;
	private int price;
	
	

	public Dealres(int value, String brand, int price) {
		this.value = value;
		this.brand = brand;
		this.price = price;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dealres [value=" + value + ", brand=" + brand + ", price=" + price + "]";
	}

}
