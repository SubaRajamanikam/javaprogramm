package Day5;

public class Mulitenum {
public static void main(String[]args) {
	int num=5;
	int multi=1;
	int add=0;
	for(int i=1;i<=num;i++) {
		multi=multi*i;
		add=multi+add;
	}
	System.out.println(multi);
	System.out.println(add);
}
}
