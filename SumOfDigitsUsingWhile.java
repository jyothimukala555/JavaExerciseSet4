package com.javaExSet4;

public class SumOfDigitsUsingWhile {

	public static void main(String[] args) {
		SumOfDigitsUsingWhile sumofdigits = new SumOfDigitsUsingWhile();
		int sum = sumofdigits.getSumOfDigits(2525);
		System.out.println("no. of digits is: "+ sum);
	}

		    public int getSumOfDigits(int number) {

		        if(number<0) {
		        return -1;
		        }
		        if(number==0) {
		        return 0;
		        }
		   
		       int sum =0;
		            while(number!=0){
		               int i =number%10;
		                sum=sum+i;
		                number=number/10;
		            }return sum;
	}

}
