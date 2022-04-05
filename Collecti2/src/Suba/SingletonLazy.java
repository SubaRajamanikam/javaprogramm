package Suba;

public class SingletonLazy {
	private static  SingletonLazy a =null; 
	private SingletonLazy () {

	}
	public static SingletonLazy getinstance() {
		if(a==null)
			a=new SingletonLazy();
		return a;
	}
	public static void main(String args[]) {
		SingletonLazy a1= SingletonLazy.getinstance();
		SingletonLazy b=  SingletonLazy.getinstance();
		if(a1==b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	
	}
}
