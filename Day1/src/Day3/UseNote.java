package Day3;
import java.util.logging.Handler;

public class UseNote {
public static void main(String[]args) {
	Note a=new Note();
	a.price=50;
	a.length=4.6f;
	a.noOfpages=200000l;
	a.brand="classmate";
	a.isquality=true;
	Note b=new Note();
	b.price=60;
	b.length=5.6f;
	b.noOfpages=100000l;
	b.brand="index";
	b.isquality=false;
	Note c=new Note();
	c.price=70;
	c.length=7.8f;
	c.noOfpages=360000l;
	c.brand="kananna";
	c.isquality=false;
	Note d=new Note();
	d.price=70;
	d.length=7.8f;
	d.noOfpages=360000l;
	d.brand="kumar";
	d.isquality=false;
	Note[] h= {a,b,c,d};
	System.out.println(h[0].price+","+h[1].price+","+h[2].price+","+h[3].price);
	if((h[1].brand)==(h[2].brand)&&(h[1].brand)!=(h[2].brand)) {
		System.out.println("yes");
	}
else {
		System.out.println("no");
	}
}
}

