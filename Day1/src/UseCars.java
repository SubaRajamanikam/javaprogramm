
public class UseCars {

	public static void main(String[] args) {
	Cars c=new Cars();
	Cars c1=new Cars();
	Cars c2=new Cars();
	c.name="kia";
	c.price=40000;
	c.weight=20.6f;
	
	c1.name="hundai";
	c1.price=50000;
	c1.weight=23.6f;
	
	c2.name="frad";
	c2.price=30000;
	c2.weight=43.6f;
	
    Cars []b= {c,c1,c2};
    for(int i=0;i<b.length;i++) {
    	System.out.println(b[i].price);
    }
//    System.out.println(b[0].price+","+b[1].price+","+b[2].price);



	}

}
