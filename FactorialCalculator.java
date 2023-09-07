package com.javaExSet4;

public class FactorialCalculator {


  public static void main(String[] args) {
	  FactorialCalculator calculator = new FactorialCalculator();
	  System.out.println(calculator.calculateFactorial(4));
  }
    public int calculateFactorial(int number) {
        
         if(number<0){
        return -1;
        }
       int fact=1;
       for(int i=2;i<=number;i++){
           fact *=i;
       }return fact;
       
    }
}

