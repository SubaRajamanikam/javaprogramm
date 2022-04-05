package day2;

public class UsePen {
public static void main(String[]arge) {
pen p1=new pen();
p1.height=7.2f;
p1.colour="green";
p1.price=10;
p1.isquality=true;
pen p2=new pen();
p2.height=8.3f;
p2.colour="block";
p2.price=20;
p2.isquality=true;
pen p3=new pen();
p3.height=6.6f;
p3.colour="red";
p3.price=25;
p3.isquality=true;

System.out.println(p1.height+","+p1.colour+","+p1.price+","+p1.isquality);
System.out.println(p2.height+","+p2.colour+","+p2.price+","+p2.isquality);
System.out.println(p3.height+","+p3.colour+","+p3.price+","+p3.isquality);


}
}
