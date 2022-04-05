package singleton;

public class UseCar {

	public static void main(String[] args) {
	Car c1=Car.instance();
	Car c2=Car.instance();
	System.out.println(c1.brand+","+c1.price);
	System.out.println(c2.brand+","+c2.price);
	System.out.println(c1);//comperble the memory address so declar the c1 syout
    System.out.println(c2);
	}

}
