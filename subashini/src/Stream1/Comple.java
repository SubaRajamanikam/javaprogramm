package Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Comple {

	public static void main(String[] args) {
	 List<Integer>lest=Arrays.asList(84,21,92,19,72,16,15,8,3);
	 List<Integer>si=lest.stream().filter(f->(f.SIZE>50)).collect(Collectors.toList());
	 si.forEach(v->System.out.println(v));
     List<Integer>add=lest.stream().filter(a->(a%2==1)).collect(Collectors.toList());
     add.forEach(b->System.out.println(b));
     add.forEach(a-> {
	   boolean ischusion=false;
   for(int i=2;i<a;i++) {
	   if(i*i==a) {
		ischusion=true;
	   }
   }
	   if(ischusion) {
		   System.out.println(a+"Not prime");
	   }
	   else {
		   System.out.println(a+" prime");
	   }
   
     
   });

   } 
   }

