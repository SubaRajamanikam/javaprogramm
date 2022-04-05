package Dayfeb7;

public class UsePhone {
public static void main(String[] args) {
	Phone p=new Phone();
	String a=args[0];
	String b=args[1];
	long c=Long.parseLong(args[2]);
	float d=Float.parseFloat(args[3]);
    int e=Integer.parseInt(args[4]);
	int f=Integer.parseInt(args[5]);
	
	Phone q=new Phone();
	String g=args[6];
	String h=args[7];
	long j=Long.parseLong(args[8]);
	float k=Float.parseFloat(args[9]);
	 int l=Integer.parseInt(args[10]);
    int z=Integer.parseInt(args[11]);

System.out.println(a+","+b+","+c+","+d+","+e+","+f);
System.out.println(g+","+h+","+j+","+k+","+l+","+z);	
System.out.println(a.toUpperCase());
System.out.println(a.toLowerCase());
System.out.println(a.charAt(2));
System.out.println(a.length());
	}

}
