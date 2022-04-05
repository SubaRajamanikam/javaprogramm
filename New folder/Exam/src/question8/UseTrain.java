package question8;

public class UseTrain {
  public static void main(String[] args) {
  Compartment c1=new Compartment(5.5f,11,"sitting");
  Compartment c2=new Compartment(5.0f,15,"sanding");
  Compartment c3=new Compartment(6.5f,13,"sleeping");
  Compartment [] c= {c1,c2,c3};
  Engine e=new Engine(100,90,"s12");
  Train t=new Train(215,"southern","passenger",c,e);
  System.out.println(t);
	}

}
