package Day1feb12OOPs;

import java.util.Arrays;

public class WhiteBoard {
	 private int price;
	 private String brand;
	 private int weight;
	 private Sheet sheet;
	 private Pin []pins;
	public WhiteBoard(int price, String brand, int weight,Sheet sheet, Pin[] pins) {
		this.price = price;
		this.brand = brand;
		this.weight = weight;
		this.sheet = sheet;
		this.pins = pins;
	}
	

	public String toString() {
		return "WhiteBoard [price=" + price + ", brand=" + brand + ", weight=" + weight + ", sheet=" + sheet + ", pins="
				+ Arrays.toString(pins) + "]";
	}



	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Sheet getSheet() {
		return sheet;
	}
	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}
	public Pin[] getPins() {
		return pins;
	}
	public void setPis(Pin[] pins) {
		this.pins = pins;
	}
	 
}
