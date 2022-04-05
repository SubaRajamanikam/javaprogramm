package Day5;

public class SkipSquar {
public static void main(String[]args) {
	int add=0;
	for (int i=1;i<=20;i++) {
		if(i==7) {
			continue;
		}
			if(i%2==1) {
				add=add+i*i;
			
				System.out.println(i*i);
		}
	}
		
		System.out.println(add);
	}

}

