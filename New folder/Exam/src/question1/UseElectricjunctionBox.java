package question1;

public class UseElectricjunctionBox {
     public static void main(String[] args) {
    Swtich s1=new Swtich("steel","sans",2.5f);
    Swtich s2=new Swtich("plastic","skiya",3.6f);
    Swtich s3=new Swtich("wood","lavanien",3.7f);
    Swtich []ss= {s1,s2,s3};
    Cover c=new Cover("labor",12.6f,10);
    ElectricjunctionBox eb=new ElectricjunctionBox("s12","venens",350,1000,ss,c);
    System.out.println(eb);
	}}
