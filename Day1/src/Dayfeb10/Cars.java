package Dayfeb10;

public class Cars {
int price;
String brand;
String model;
int findnetprice(int tax) {
	int netprice=this.price*tax/100;
	return netprice;
}
int taxprice(int price) {
	int taxprice=this.price*20/100;
	return taxprice;
}
}
