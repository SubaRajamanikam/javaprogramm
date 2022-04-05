package Day2feb12Encapusation3;

public class UseHome {

	public static void main(String[] args) {
	
Member m1=new Member("raja",50,true);
Member m2=new Member("kanni",45,true);
Member m3=new Member("suba",22,false);
Member m4=new Member("prema",19,false);
Member m5=new Member("mano",25,false);
Member [] m={m1,m2,m3,m4,m5};
Address a=new Address(12,"north street","thamapram","621800");
Type t=new Type(2,"fristfloor");
Home h=new Home("lashmi",m,a,t);

	

   System.out.println(h);
	}

}
