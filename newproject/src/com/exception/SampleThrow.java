package com.exception;

public class SampleThrow {
    
	static void aavg() {
		try {
			throw new ArithmeticException("Demo");
		} catch(ArithmeticException e) {
			System.out.println("Exception caught");
			
		}
	}
	public static void main(String []args) {
		aavg();
		
	}
}
