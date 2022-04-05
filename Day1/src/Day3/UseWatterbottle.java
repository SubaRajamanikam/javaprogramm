package Day3;

public class UseWatterbottle {
public static void main(String[]arge) {
	Watterbottle a=new Watterbottle();
	a.length=7;
	a.breadth=4.5f;
	a.colour="red";
	a.isplastic=true;
	Watterbottle b=new Watterbottle();
	b.length=6;
	b.breadth=5.5f;
	b.colour="green";
	b.isplastic=false;
	Watterbottle c=new Watterbottle();
	c.length=5;
	c.breadth=6.5f;
	c.colour="blue";
	c.isplastic=false;
	Watterbottle d=new Watterbottle();
	d.length=8;
	d.breadth=7.5f;
	d.colour="white";
	d.isplastic=true;
	Watterbottle[] ls= {a,b,c,d};
			for(int n=0;n<ls.length;n++) {
        System.out.println(ls[n].length);
		System.out.println(ls[n].breadth);
		System.out.println(ls[n].colour);
		System.out.println(ls[n].isplastic);
		
		
		
	}
		
	}
//	System.out.println(ls[0].length+","+ls[0].breadth+","+ls[0].colour+","+ls[0].isplastic);
//	System.out.println(ls[1].length+","+ls[1].breadth+","+ls[1].colour+","+ls[1].isplastic);
//	System.out.println(ls[2].length+","+ls[2].breadth+","+ls[2].colour+","+ls[2].isplastic);
//	System.out.println(ls[3].length+","+ls[3].breadth+","+ls[3].colour+","+ls[3].isplastic);
//}

}
