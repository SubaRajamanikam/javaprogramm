package Day6;

public class ArrayLoop {

	public static void main(String[] args) {
		int []a= {100,1000,250,500,900};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
		}
		}
System.out.println(max);
	}

}
