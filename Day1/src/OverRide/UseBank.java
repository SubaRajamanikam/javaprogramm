package OverRide;

public class UseBank {
public static void main(String arsg[]) {
	Bank b=new Bank();
	System.out.println(b.getLoan(50000));
	AxisBank ab=new AxisBank();
	System.out.println(ab.getLoan(50000));
	HdfcBank hb=new HdfcBank();
	System.out.println(hb.getLoan(50000));
	
}
}
