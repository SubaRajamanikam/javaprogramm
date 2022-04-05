package question5;

public class UseChair {
    public static void main(String[] args) {
  Legs l1=new Legs("steel","leftcorner",5);
  Legs l2=new Legs("steel","rightcorner",3);
  Legs l3=new Legs("steel","frontcorner",4);
  Legs l4=new Legs("steel","bockcorner",7);
  Legs []ls= {l1,l2,l3,l4};
  Seat s=new Seat("lather",true,false);
  Chair c=new Chair("lezse",500,true,ls,s);
  System.out.println(c);
	}

}
