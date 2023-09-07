package com.javaExSet4;

public class LCMofANumber {

	private int number1;
	private int number2;
	
	public LCMofANumber(int number1,int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public static void main(String[] args) {
		LCMofANumber lcmOfANumber = new LCMofANumber(5,10);
		
		System.out.println("The LCM of 2 numbers : "+lcmOfANumber.calculateLCM());
		}
	
	public int calculateLCM() {
	if(number1<0 || number2<0)
		return -1;
	if(number1==0 || number2==0)
		return 0;
	int max = Math.max(number1, number2);
	int lcm =max;
	while(true) {
		boolean finalLCM = lcm%number1==0 || lcm%number2==0;
		if(finalLCM) {
			return lcm;
		}lcm += max;
	}
	}
}
