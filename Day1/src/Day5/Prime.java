package Day5;

public class Prime {

	public static void main(String[] args) {
	int prime=7;
	int temp=0;
	boolean isprime=true;
	for(int i=2;i<=prime;i++) {
		if(prime%i==0) {
	temp++;
		}	
	if(temp==0) {
		System.out.println(" prime number");
	}
	else {
		System.out.println("not prime number");

	}

}
	}
}
