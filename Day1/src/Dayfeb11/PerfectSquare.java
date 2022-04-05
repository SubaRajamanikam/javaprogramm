package Dayfeb11;

public class PerfectSquare {

	public static void main(String[] args) {
	
       int num=25;
       boolean flag=true;
       for(int i=2;i<num;i++) {
    	   if(num==i*i) {
    		   flag=false;
    		   break;
       }
       }
       if (flag==false) {
    	   System.out.println("perfect square");
       }
       else {
      System.out.println("not a perfect square");
}
}
}