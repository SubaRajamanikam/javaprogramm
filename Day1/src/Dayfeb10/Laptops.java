package Dayfeb10;

public class Laptops {
int price;
String brand;
String model;

void price() {
	if(price>10000&&price<20000) {
	System.out.println("cheap");
}
	else if(price>20000&&price<50000) {
	System.out.println("mid");

}
	else if(price>50000) {
	System.out.println("high");
}
	else { 
              System.out.println("nuill");
}
}
}
