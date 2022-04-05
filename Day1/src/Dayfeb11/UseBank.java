package Dayfeb11;

public class UseBank {

	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank();
		Bank b3=new Bank();
		b1.age=20;
		b1.name="subasnini";
		b1.amount=200000;
		b2.age=30;
		b2.name="asha";
		b2.amount=500000;
		b3.age=50;
		b3.name="mano";
		b3.amount=50000;
		Bank b[]= {b1,b2,b3};
		
     b1.findloan(b);
	}

}
