package Day2feb12Encapusation2;

public class Address {
	private int doorno;
	private String name;
	private String city;
	private String districk;
	private int pin;
	public Address(int doorno, String name, String city, String districk, int pin) {
		super();
		this.doorno = doorno;
		this.name = name;
		this.city = city;
		this.districk = districk;
		this.pin = pin;
	}
	public String toString() {
		return "Address [doorno=" + doorno + ", name=" + name + ", city=" + city + ", districk=" + districk + ", pin="
				+ pin + "]";
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrick() {
		return districk;
	}
	public void setDistrick(String districk) {
		this.districk = districk;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
