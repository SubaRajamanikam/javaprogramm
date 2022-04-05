package Dayfeb10;

public class Onelife {
public static void main(String args[]) {
	
	String a="Ramkrishnna";
	char[]b=a.toCharArray();
	int c=b.length;
	String []d=a.split(",");
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.toCharArray());
	System.out.println(a.charAt(5));
	System.out.println(a.indexOf('a'));
	System.out.println(a.startsWith("R"));
	System.out.println(a.endsWith("a"));
	System.out.println(a.equals("RAMKRISHNNA"));
	System.out.println(a.equalsIgnoreCase("ramkrishnna"));
	System.out.println(d[0]);
	
	}
}
