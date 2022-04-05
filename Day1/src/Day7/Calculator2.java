package Day7;

public class Calculator2 {
int add() {
	int a=10;
	int b=10;
	int c=a+b;
	return c;
}
int sub() {
	int a=10;
	int b=20;
	int c=a-b;
	return c;
	
}
int mul() {
	int a=10;
	int b=20;
	int c=a*b;
	return c;
}	
int divsion() {
	int a=10;
	int b=20;
	int c=a/b;
	return c;
}
int marols() {
	int a=10;
	int b=20;
	int c=a%b;
	return c;
}
	public static void main(String[]args) {
		Calculator2 a=new Calculator2();
		System.out.println(a.add());
		System.out.println(a.sub());
		System.out.println(a.mul());
		System.out.println(a.divsion());
		System.out.println(a.marols());
	}
}

