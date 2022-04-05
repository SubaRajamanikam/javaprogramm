package Day5;

public class CondtionLoop {
public static void main(String[]args) {
	int[]values= {2,1,3,5,7,-1,-2,-3,-4,10,-5,-7};
	int positive=0;
	int nativenum=0;
	for(int i=0;i<values.length;i++) {
		if(values[i]>0) {
		System.out.println("positive="+values[i]);
		positive++;
	
	}
	else {
		System.out.println("nativenum="+values[i]);
		nativenum++;
	}
	}
	System.out.println("positive="+positive);
	System.out.println("nativenum="+nativenum);
}
}
