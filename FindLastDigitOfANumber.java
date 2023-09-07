package com.javaExSet4;

public class FindLastDigitOfANumber {
    
	public static void main(String[] args) {
		FindLastDigitOfANumber numberUnitPlace = new FindLastDigitOfANumber();
		
		System.out.println(numberUnitPlace.getLastDigit(556));
	}
	

	    public int getLastDigit(int number) {
	       int result =0;
	        if(number<0){
	        return -1;
	        }
	        else{
	           result= number%10;
	        }
	        return result;
	    }
	}

