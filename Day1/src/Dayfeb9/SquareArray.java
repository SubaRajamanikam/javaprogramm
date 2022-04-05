package Dayfeb9;

public class SquareArray {

	public static void main(String[] args) {
		int [] a= {10,20,25,30,35};
		int add=0;
		for(int i=0;i<a.length;i++) {
        add=add+(a[i]*a[i]);
        
		}
		int b=(int)(add);
        System.out.println(add);
	}

}
