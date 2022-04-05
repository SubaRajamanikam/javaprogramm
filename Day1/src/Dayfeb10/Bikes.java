package Dayfeb10;
//method usepannerdhu:
public class Bikes {
int price;
String brand;
int enginecc;

String engineccBikes(Bikes b1,Bikes b2) {
 if(this.enginecc<b1.enginecc&&this.enginecc>b2.enginecc) {
	 return this.brand;
 }
 else if(b1.enginecc>this.enginecc&&b1.enginecc>b2.enginecc) {
	 return b1.brand;
 
}
else {
	return b2.brand ;
}
}
}