package Dayfeb1arredtion;

public class Vehicle {
public void engine() {
	System.out.println("heart of vehicle");
}
public void tyre() {
	System.out.println("very importan");
}
}
class Car extends Vehicle{

	public void engine() {
		System.out.println("this small size in car");
	}
	public void tyre() {
		System.out.println("it is small size tyre");
	}
	public void seats() {
		System.out.println("4 seats");
	}
}