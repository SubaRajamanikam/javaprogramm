package subashini;

public class Sample{

	public static void main(String[] args) {
		OddorEven o=()-> { int a=8;if(a%2==0)return a+"Even";
		else return a+"odd"; };
		System.out.println(o.getNum());
		
		OddorEven v=()-> { int a=45;if(a>18 && a<40)return a+"a Grad";
		else if(a>40 && a<50)return a+"b grad";else return a+"C grad"; };
		System.out.println(v.getNum());
		
		 
		
	}

}
