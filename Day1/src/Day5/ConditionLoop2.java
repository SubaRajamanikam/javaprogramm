package Day5;

public class ConditionLoop2 {
public static void main(String[]args) {
	int[] num= {11,20,17,15,22,19,32,40,18};
	int add=0;
	int add2=0;
	
	for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			add=add+(num[i]*num[i]);
			
		}
		else {
			add2=add2+(num[i]*num[i]*num[i]);
		}	
		}
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
		System.out.println(num.length);
		
	}
}

