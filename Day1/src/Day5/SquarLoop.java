package Day5;

public class SquarLoop {
public static void main(String[]args) {
 float[]num= {1.01f,2.02f,3.02f,4.01f,5.0f};
 float add=0;
 
 for(int i=0;i<num.length;i++) {
	 add=add+(num[i]*num[i]);
	 
 }
 int b=(int)(add);
 
 System.out.println(add);
 System.out.println(b);
 
}
}
