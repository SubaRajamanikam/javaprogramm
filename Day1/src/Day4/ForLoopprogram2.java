package Day4;

public class ForLoopprogram2 {
	public static void main(String[]args) {

		float[]net= {9.1f,2.6f,4.6f,5.6f,7.8f,};
		for(int h=0;h<net.length;h++) {
			System.out.println(net[h]);
		
		int[]a= {10,20,30,40,50};
		int add=0;
		for(int b=0;b<a.length;b++) {
			add=add+a[b];
			System.out.println(a[b]);
			
			
			
		}
		System.out.println(add);
		System.out.println(add/a.length);
		
	}
}
}