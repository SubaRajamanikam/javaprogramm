package Dayfeb9;

public class EvenOdd {

	public static  void main(String[] args) {
	int [] a= {1,2,3,4,5,6,7,8,9,10};
	int odd=0;
	int even=0;
	for(int i=0;i<a.length;i++) {
		 even=even++;
		 if(i==even) {
			 continue;
		 }
	
		 else if(i==odd) {
		 odd=odd++;
	}
	
		 System.out.println(odd);
	}

	}
}
	
	

