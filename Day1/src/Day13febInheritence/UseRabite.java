package Day13febInheritence;

public class UseRabite {

	public static void main(String[] args) {
    Rabite a=new Rabite();
    a.behavire="angre";
    a.qty=10;
    a.food="caret";
    a.colour="white";
    DomesticAnimal da=new DomesticAnimal();
    da.character="smart";
    da.teeth=8;
    System.out.println(a.behavire+","+a.qty+","+a.food+","+a.colour);
    System.out.println(da.character+","+da.teeth);
    
	}

}
