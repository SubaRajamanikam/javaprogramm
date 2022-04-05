package Day13febInheritence;

public class UseIndianBank {

	public static void main(String[] args) {
	IndianBank ib=new IndianBank();
	System.out.println(ib.getLoan());
	System.out.println(ib.getLoan(30000));
	System.out.println(ib.getLoan(300000,500000));
    ib.getLoaneligble(38);
    ib.getLoaneligble(25);
    ib.getLoaneligble(42);
	}

}
