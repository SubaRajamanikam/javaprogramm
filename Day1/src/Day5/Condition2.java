package Day5;

public class Condition2 {

	public static void main(String[] args) {
	String b= "punitha";
	char[] c=b.toCharArray();
	int d=0;
	int add=0;
	for(int i=0;i<c.length;i++) {
if((c[i]=='a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u')) {
	System.out.println(c[i]+"is vowels");

d=d+1;
}
else {
	System.out.println(c[i]+"is not vowels");
	add=add+1;
}
	}
System.out.println("vowels total="+d);
System.out.println("vowels total="+add);
}
}
