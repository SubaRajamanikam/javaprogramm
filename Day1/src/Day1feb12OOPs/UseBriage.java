package Day1feb12OOPs;

public class UseBriage {

	public static void main(String[] args) {
		Door d=new Door();
		d.setPrice(4000);
		d.setColour("block");
		Rack m1=new Rack();
		m1.setWeight(20);
		m1.setName("lg");
		Rack m2=new Rack();
		m2.setWeight(20);
		m2.setName("sony");
		Rack m3=new Rack();
		m3.setWeight(50);
		m3.setName("gooderj");
		Rack []ms= {m1,m2,m3};
		Briage a=new Briage();
		a.setPrice(15000);
		a.setBrand("camiprd");
		a.setDoor(d);
		a.setRack(ms);
		for(int i=0;i<ms.length;i++) {
			System.out.println(ms[i].getName()+","+ms[i].getWeight());		
	}
    System.out.println(a.getPrice()+","+a.getBrand()+","+a.getDoor().getPrice()+","+a.getDoor().getColour());
}
}