package Day1feb12OOPs;

public class UseInjection {

  public static void main(String[] args) {
		
		Netile n=new Netile(10,7.5f);
		System.out.println(n);
		Ruberstic r1=new Ruberstic("block","topup",15);
		Ruberstic r2=new Ruberstic("green","town",20);
		Ruberstic r3=new Ruberstic("lawo","toright",18);
		Ruberstic r4=new Ruberstic("rose","toleft",23);
		Ruberstic [] rs= {r1,r2,r3,r4};
		Injection i=new Injection(1000,"wenish",12.0f,n,rs);
		System.out.println(i);
		System.out.println(rs[0]+","+rs[1]+","+rs[2]+","+rs[3]);
	}

}
