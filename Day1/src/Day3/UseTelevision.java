package Day3;

public class UseTelevision{
public static void main(String[]args) {
	Television a1=new Television();
	a1.price=200000l;
	a1.brand="lg";
	a1.size=4;
	a1.isandroidtype=true;
	Television a2=new Television();
	a2.price=300000l;
	a2.brand="mi";
	a2.size=8;
	a2.isandroidtype=false;
	Television a3=new Television();
	a3.price=400000l;
	a3.brand="sony";
	a3.size=15;
	a3.isandroidtype=false;
	System.out.println(a1.price+","+a1.brand+","+a1.size+","+a1.isandroidtype);
	System.out.println(a1.brand+","+a2.brand+","+a3.brand);
	System.out.println(a1.price+a2.price+a3.price);
	System.out.println(a1.size+a3.size);
	
	}
}
