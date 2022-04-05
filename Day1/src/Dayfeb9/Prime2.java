package Dayfeb9;

public class Prime2 {
public static void main(String args[]) {
	int a=29;
//	int count=0;
	boolean isprime=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			isprime=false;
//			count++;
		}
	}
//	if(count<=1) {
	if(isprime==true) {
		System.out.println("prime");
	}
	else {
		System.out.println("not a prime");
	}
}
}
