package Day5;

public class UseCar1 {

public static void main(String[] args) {
Car1 c1=new Car1();
c1.brand="bmw";
c1.price=1200000;
c1.model=2000;

Car1 c2=new Car1();
c2.brand="Honda";
c2.price=1300000;
c2.model=2020;

Car1 c3=new Car1();
c3.brand="Audi";
c3.price=1400000;
c3.model=2022;
Car1[] cars= {c1,c2,c3};
int a=0;
String b=" ";
for(int i=0;i<cars.length;i++) {
if(cars[i].price>a) {
	a=cars[i].price;
	b=cars[i].brand;
}
}
System.out.println("maximum price="+a+","+"brand name="+b);

}
}






