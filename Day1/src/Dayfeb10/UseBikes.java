package Dayfeb10;

public class UseBikes {

	public static void main(String[] args) {
     Bikes b1=new Bikes();
     Bikes b2=new Bikes();
     Bikes b3=new Bikes();
     b1.price=50000;
     b1.brand="hero";
     b1.enginecc=450;
     b2.price=60000;
     b2.brand="yamha";
     b3.enginecc=350;
     b3.price=70000;
     b3.brand="tvs";
     b3.enginecc=250;
     System.out.println(b2.engineccBikes(b1,b3));
	}

}
