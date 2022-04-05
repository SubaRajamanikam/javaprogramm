package Day1feb12OOPs;

public class UseBoard {

	public static void main(String[] args) {
	Backboard b=new Backboard();
	b.setPrice(450);
	b.setColour("white");
	Blot b1=new Blot();
	b1.setPrice(20);
	b1.setMaterila("steal");
	Blot b2=new Blot();
	b2.setPrice(10);
	b2.setMaterila("steal");
	Blot b3=new Blot();
	b3.setPrice(15);
	b3.setMaterila("steal");
	Blot b4=new Blot();
	b4.setPrice(18);
	b4.setMaterila("steal");
	Blot []bs= {b1,b2,b3,b4};
	Board p=new Board();
	p.setPrice(1000);
	p.setBrand("thikpad");
	p.setWeight(11);
	p.setBack(b);
	p.setBlot(bs);
	for(int i=0;i<bs.length;i++) {
	
	System.out.println(bs[i].getPrice()+","+bs[i].getMaterila());
	}
	System.out.println(p.getPrice()+","+p.getBrand()+","+p.getWeight()+","+p.getBack().getPrice()+","+p.getBack().getColour());
	}

}
