package Day7;
//consider tostring
public class Loptop {
String name;
 int price;
float kg;
public  Loptop(String name,int price,float kg) {
	this.name=name;
	this.price=price;
	this.kg=kg;
}
public String toString() {
	return name+","+price+","+kg;
}
}
