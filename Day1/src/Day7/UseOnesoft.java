package Day7;

public class UseOnesoft {

	public static void main(String[] args) {
	
Address1 a=new Address1();
    a.doorno=4;
	a.streetname="kandhanchavdistreet";
	a.distick="chennai";
	a.state="tamilnadu";
	a.pincode=24469;
	Onesoft e=new Onesoft();
 	e.id=2;
 	e.name="suba";
 	e.salary=5500;
 	e.companyname="onesoft";
 	e.contactnumber=8095236747l;
a.add=e;
System.out.println(a.add.id+","+a.add.name+","+a.add.salary+","+a.add.companyname+","+a.add.contactnumber);
System.out.println(a.doorno+","+a.streetname+","+a.state+","+a.pincode);
}
}