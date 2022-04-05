package Day5;

public class SquarevalueLoop {
public static void main(String[]args) {
	int add=0;
	for (int i=1;i<=100;i++) {
		if(i%2==1) {
			add=add+(i*i*i);
//	add=add+(i*i);
		}
	}
	System.out.println(add);
}
}
