package question6;

public class UseDoor {
   public static void main(String[] args) {
   Lock l1=new Lock("Topright","manuvle","offices");
   Lock l2=new Lock("Topleft","fingerprint","daox");
   Lock l3=new Lock("downleft","sensire","idexes");
   Lock [] l= {l1,l2,l3};
   Stopper s=new Stopper("steel",9,"conline");
   Door d=new Door("venens",12,1500,"wood",l,s);
   System.out.println(d);
	}

}
