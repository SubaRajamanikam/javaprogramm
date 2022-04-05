package Day2feb12Encapusation2;

public class Speaker {
	private String brand;
	private String position;
	public Speaker(String brand,String position) {
	
	this.brand=brand;
	this.position=position;
	}
	public String toString() {
		return "Speaker [brand=" + brand + ", position=" + position + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
}
