package Dayfeb11;

public class UseBooker {

	public static void main(String[] args) {
		Booker b1=new Booker();
		Booker b2=new Booker();
		Booker b3=new Booker();
		b1.name="tamil";
		b1.page=200;
		b1.weight=2.60f;
		b2.name="tamil";
		b2.page=200;
		b2.weight=2.60f;
		b3.name="tamil";
		b3.page=200;
		b3.weight=2.60f;
		
       Booker []b= {b1,b2,b3};
        b1.fact();
	}
	

}
