package Day5;

public class SkipLoop2 {
public static void main(String[]args) {
	int add=0;
	for (int i=1;i<=10;i++) {
		if(i==3) {
		
			continue;
		}
		if(i==5) {
			continue;
		}
		
		if(i%2==1) {
		add=add+i*i;
			System.out.println(i*i);
		}
	
	}
//	System.out.println(add);

}
}
