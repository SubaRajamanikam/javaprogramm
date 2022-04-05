package Day6;

public class Method3 {
public static void main(String[]args){
	String a="whiteboArd";
	String c=a.toUpperCase();
	char[]b=c.toCharArray();
	int l=a.length();
	int vowelsCount=0;
	int cCount=0;
	for(int i=0;i<b.length;i++) {
		if((b[i]=='a')||(b[i]=='e') ||(b[i]=='i')|| (b[i]=='o')|| (b[i]=='u')) {
		vowelsCount++;
			System.out.println("vowelsCount:"+b[i]);			
	}  
		else {
			cCount++;
			System.out.println("cCount:"+b[i]);
		}
		
	}
	System.out.println("vowelsCount="+vowelsCount);
	System.out.println("cCount="+cCount);
	System.out.println(b.length);
			System.out.println(l);
}

	
}


