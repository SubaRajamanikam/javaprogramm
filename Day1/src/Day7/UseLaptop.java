package Day7;

public class UseLaptop {
public static void main(String[]args) {
	Loptop l=new Loptop("sony",7000,25.5f);
	System.out.println(l.name+","+l.price+""+l.kg);
	Loptop m=new Loptop("lg",4000,23.5f);
	System.out.println(m.name+","+m.price+""+m.kg);
	Loptop n=new Loptop("deli",5000,24.5f);
	System.out.println(n.name+","+n.price+""+n.kg);
	System.out.println(l);
	System.out.println(m);
	System.out.println(n);
}
}
