package Day5;

public class NewCondition {
public static void main(String[]args) {
	int []a= {2,3,5,7,11,9,8,10,12};
	int evencount=0;
	int oddcount=0;
	
	for(int i=0;i<9;i++) {
		if(a[i]%2==0) {
			evencount++;
			System.out.println("even:"+a[i]);
		}
		else{
			oddcount++;
			System.out.println("odd:"+a[i]);
		}
	}
		System.out.println("evencount="+evencount);
		System.out.println("oddcount="+oddcount);
		System.out.println(evencount+oddcount);
}
}
