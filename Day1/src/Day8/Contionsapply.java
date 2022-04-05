package Day8;

public class Contionsapply {
	public static void main(String args[]) {
		
    int [] a= {55,92,84,102,7,5,2};
     for(int i=0;i>a.length;i++) {
	if(a[i]>5) {
		break;
	}
	else if(a[i]<100) {
		continue;
	}
		System.out.println(a[i]);
	}
}
}
