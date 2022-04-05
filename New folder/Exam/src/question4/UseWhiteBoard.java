package question4;

public class UseWhiteBoard {
   public static void main(String[] args) {
   Pin p1=new Pin("frontright","steel",2);
   Pin p2=new Pin("frontleft","steel",5);
   Pin p3=new Pin("sidecorner","steel",3);
   Pin p4=new Pin("tupleft","steel",4);
   Pin []ps= {p1,p2,p3,p4};
   Sheet s=new Sheet("paper",6,8,"white");
   WhiteBoard w=new WhiteBoard("lamoneya",12.5f,1500,"wood",ps,s);
   System.out.println(w);
	}

}
