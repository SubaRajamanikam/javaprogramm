package Day5;

public class ReversLoop {
public static void main(String[]args) {
	int num=1234;
	int revers=0;
	
	for( ;num>0;num/=10) {
		 int remender=num%10;
		revers=revers*10+remender;
	}
	
	

	System.out.println(revers);
	

}
}