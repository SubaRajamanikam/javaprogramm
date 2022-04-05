package Dayfeb10;

public class UseCars {

	

	public static void main(String[] args) {
		Cars c=new Cars();
		c.price=25000;
		c.brand="hudai";
		c.model="thinpad";
		System.out.println(c.findnetprice(10));
		System.out.println(c.taxprice(20/100));
	}

}
