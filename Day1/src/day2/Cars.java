package day2;

public class Cars {
public static void main(String[]arge) {
	Car c1=new Car();
	c1.name="audi";
	c1.price=2000000l;
	c1.weight=66.2f;
	Car c2=new Car();
	c2.name="bmw";
	c2.price=5000000l;
	c2.weight=77.8f;
	Car c3=new Car();
	c3.name="kia";
	c3.price=6000000l;
	c3.weight=88.2f;
	Car [] cars= {c1,c2,c3};
	System.out.println(cars[0].name+","+cars[0].price+","+cars[0].weight);
	System.out.println(cars[1].name+","+cars[1].price+","+cars[1].weight);
	System.out.println(cars[2].name+","+cars[2].price+","+cars[2].weight);
	if ((cars[1].price>cars[2].price)&&(cars[2].price>cars[3].price)) {
	System.out.println("yes");
}
	else {
		System.out.println("no");

	}
}
}