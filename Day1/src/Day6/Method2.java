package Day6;

public class Method2 {
public static void main(String[]args) {
	String a="Transportation";
	char[] b=a.toCharArray();
    int l=a.length();
	for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	}
	System.out.println(b.length);
	System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	System.out.println(a.charAt(5));
	System.out.println(a.indexOf('s'));
	System.out.println(a.startsWith("T"));
}
}
