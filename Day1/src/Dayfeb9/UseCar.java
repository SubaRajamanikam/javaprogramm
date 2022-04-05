package Dayfeb9;

public class UseCar {

	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		c.brand="kia";
		c.regnumber=2348;
		c.price=200000l;
		c.model="s192";
		
		c1.brand="ford";
		c1.regnumber=3348;
		c1.price=400000l;
		c1.model="a1192";
		
		c2.brand="bmw";
		c2.regnumber=5348;
		c2.price=250000l;
		c2.model="ln125";
		
		c3.brand="hundai";
		c3.regnumber=4448;
		c3.price=350000l;
		c3.model="ai125";
		Car []a= {c,c1,c2,c3};
		for(int i=0;i<a.length;i++) {
			if((a[i].regnumber>4448)&&(a[i].regnumber<5348)) {
				System.out.println("garter then");
			}
			else {
				System.out.println("lessthen");
			}
				System.out.println(a[i].regnumber+","+a[i].brand+","+"this car of 4 digit number");
				
			}
		System.out.println(a.length);
			
			
		}
	}


