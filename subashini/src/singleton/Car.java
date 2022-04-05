package singleton;

public class Car {
 String brand;
 int price;
private Car(String brand, int price) {
	this.brand=brand;
	this.price=price;
}
private static Car c =null;
public static Car instance() {
if(c == null ) {
	c=new Car("hundai",50000); }
		return c;
	
}
}
