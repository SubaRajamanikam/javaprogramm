package Day1feb12OOPs;

public class UseChair {

	public static void main(String[] args) {
    
Seat s=new Seat();
s.materila="leather";
s.price=500;
s.weight=3;
Leg l1=new Leg();
l1.materila="steal";
l1.position="fl";
Leg l2=new Leg();
l2.materila="steal";
l2.position="fr";
Leg l3=new Leg();
l3.materila="steal";
l3.position="bl";
Leg l4=new Leg();
l4.materila="steal";
l4.position="bl";
Leg []legs= {l1,l2,l3,l4};
Chair c=new Chair();
c.price=200;
c.brand="lg";
c.seat=s;
c.legs=legs;
for(int i=0;i<legs.length;i++) {
//System.out.println(c.price+","+c.brand+","+c.seat.materila+","+c.seat.price+","+c.seat.weight);
//System.out.println(c.legs[0].materila+","+c.legs[0].position+","+c.legs[1].materila+","+c.legs[1].position+","+c.legs[2].materila+","+c.legs[2].position);

	System.out.println(legs[i].materila+","+legs[i].position);

	}

}
}