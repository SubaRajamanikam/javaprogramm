package Dayfeb9;

public class UseLaptop {

	public static void main(String[] args) {
	Laptop p=new Laptop();
	String a=args[0];
	String b=args[1];
	int c=Integer.parseInt(args[2]);
	int d=c/10+c;
	System.out.println(a.toUpperCase()+","+b.toUpperCase()+","+d);

	}

}
