package Day7;

public class Lesson {
void add(int a) {
	
if(a%2==0) {
	System.out.println("even");
}
else {
	System.out.println("odd");
}
}
int addd(int a) {
	if(a%2==0) {
		System.out.println("even");
	}
	else{
		System.out.println("odd");
	}
	return a;
}
public static void main(String[]args) {
	Lesson m=new Lesson();
	m.add(12);
	System.out.println(m.addd(29));
	}


	
}


