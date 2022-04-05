package Day7;

public class Calculator{
void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
void sub() {
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);	
}
void mult() {
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);	
}
void divison() {
int a=10;
int b=20;
int c=a/b;
System.out.println(c);	
}
void marols() {
int a=10;
int b=20;
int c=a%b;
System.out.println(c);	
}
public static void main(String[]args) {
	Calculator m=new Calculator();
	m.add();
	m.sub();
	m.mult();
	m.divison();
	m.marols();
	
}
}

