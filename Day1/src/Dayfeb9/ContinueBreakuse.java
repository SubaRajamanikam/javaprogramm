package Dayfeb9;

public class ContinueBreakuse {

	public static void main(String[] args) {
		int []a= {55,92,84,102,7,2,5};
		for(int i=0;i<100;i++) {
			if(a[i]<5) {
				break;
			}
			else if(a[i]>100) {
				continue;
			}
			System.out.println(a[i]);
		}

	}

}
