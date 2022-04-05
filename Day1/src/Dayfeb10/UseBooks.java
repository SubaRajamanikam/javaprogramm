package Dayfeb10;

public class UseBooks {

	public static void main(String[] args) {
		Books b1=new Books();
		Books b2=new Books();
		Books b3=new Books();
		b1.pages=100;
		b1.price=250;
		b1.name="tamil";
		b2.pages=100;
		b2.price=250;
		b2.name="tamil";
		b3.pages=100;
		b3.price=250;
		b3.name="tamil";
		Books []a= {b1,b2,b3};
		
      b1.findsize();
	}

}
