package Day6;

public class UseMethodcall {
public static void main(String[]args) {
	MethodCall1 m=new MethodCall1();
	System.out.println(m.add(10, 2));
	m.name("maarker");
	m.sub(10,7.8f);
	System.out.println(m.mul(10.0f,11));
	m.display();
	
	
			
}
}
