package com.javaExSet4;

public class GCDofANumber {

	
	private int number1;
	private int number2;
	
	public GCDofANumber(int number1, int number2) {
		
		this.number1=number1;
		this.number2=number2;
	}
	
	public int getNumber1() {
		return number1;
	}	
	public int getNumber2() {
		return number2;
	}	
	public void setNumber1(int number1) {
		this.number1=number1;
	}
	public void setNumber2(int number2) {
		this.number2=number2;
	}
	
	
	public static void main(String[] args) {
		GCDofANumber gcdOfANumber = new GCDofANumber(48,18);
		System.out.println("The GCD of given numbers is : " + gcdOfANumber.calculateGCD());
	}
	public int calculateGCD() {
		if (number1==0 || number2==0)
			return 0;
		if(number1<0 || number2<0)
			return 1;
		if(number1==number2)
			return number1;
		int min =Math.min(number1, number2);
		for(int i=min;i>0;i--) {
			 boolean isDivisorOfBothNumbers = number1%i==0 && number2%i==0;
		if(isDivisorOfBothNumbers) {
			return i;
		}
		}
		return -1;
	}
}
