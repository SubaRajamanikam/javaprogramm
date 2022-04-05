package Day3;

public class UseDoor {
public static void main(String[]args) {
	Door a=new Door();
	a.price=500;
	a.length=6.7f;
	a.colour="block";
	a.materialtype='a';
	a.islock=true;
	Door a1=new Door();
	a1.price=600;
	a1.length=7.1f;
	a1.colour="green";
	a1.materialtype='b';
	a1.islock=false;
	Door a2=new Door();
	a2.price=700;
	a2.length=8.1f;
	a2.colour="red";
	a2.materialtype='g';
	a2.islock=false;
	Door[] d= {a,a1,a2};
	for (int i=0;i<d.length;i++) {
		if(d[1].price<d[2].price)
//		if(d[i].price>500) {
		System.out.println(d[i].price);
//		System.out.println(d[i].colour);
//		System.out.println(d[i].length);
//		System.out.println(d[i].materialtype);
		
		
		
		
	}
//	System.out.println(d[0].price+","+d[0].length+","+d[0].colour+","+d[0].materialtype+","+d[0].islock);
//	System.out.println(d[1].price+","+d[1].length+","+d[1].colour+","+d[1].materialtype+","+d[1].islock);
//	System.out.println(d[2].price+","+d[2].length+","+d[2].colour+","+d[2].materialtype+","+d[2].islock);
//	if((d[0].price)>(d[0].price)&&(d[0].price)>(d[2].price)){
//		System.out.println("yes");
//	}
//	else {
//		System.out.println("no");
//	}
//	
}
}
