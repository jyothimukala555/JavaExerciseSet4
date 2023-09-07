package com.javaExSet4;

public class FindNumberOfDigitsInANumber {

	public static void main(String[] args) {
		FindNumberOfDigitsInANumber numberOfDigits = new FindNumberOfDigitsInANumber();
		int count = numberOfDigits.getNumberOfDigits(123459304);
		System.out.println("Number of digits in given number is : "+ count);
	}
		
		   
		    public int getNumberOfDigits(int number) {
		    	if(number<0){
			        return -1;
			        }
			        
		        if(number==0) {
		        return 1;
		        }
		        
		        int count =0;//0,1,2,3,4,5
		       while(number>0) {  //12345,1234,123,12,1
		           number = number/10;//1234,123,12,1,0
		            count++;//1,2,3,4,5
		       }
		        return count;
	}

}
