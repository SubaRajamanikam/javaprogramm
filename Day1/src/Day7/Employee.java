package Day7;

public class Employee {
int  id;
String name;
int salary;
String companyname;
long contactnumber;
Address add;
}
 class Address {
int doorno;
String streetname;
String distick;
String state;
int pincode;

}
 class UseEmployee {
	 public static void main(String[]args) {

	 	Address a=new Address();
	 	a.doorno=3;
	 	a.streetname="northstreet";
	 	a.distick="ariyalur";
	 	a.state="tamilnadu";
	 	a.pincode=23469;
	 	Employee e=new Employee();
	 	e.id=2;
	 	e.name="suba";
	 	e.salary=25000;
	 	e.companyname="onesoft";
	 	e.contactnumber=9095236747l;
	 	
	 e.add=a;
	 System.out.println(e.add.doorno+","+e.add.streetname+","+e.add.distick+","+e.add.state+","+e.add.pincode);
	 System.out.println(e.id+","+e.name+","+e.salary+","+e.companyname+","+e.contactnumber);
	 }
	 }
