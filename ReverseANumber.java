package com.javaExSet4;

public class ReverseANumber {
	
	
public static void main(String[] args) {
	

	ReverseANumber reverseNumber = new ReverseANumber();
int result = reverseNumber.getReverseOfADigits(1234);
System.out.println("reverse of digits is: "+ result);
}

    public int getReverseOfADigits(int number) {

        if(number<0) {
        return -1;
        }
        if(number==0) {
        return 0;
        }
   
       int result =0;
            while(number!=0){//1234,123,12,1,0--exit
              int digit =number%10;//4,3,2,1
               result =result*10 +digit;//0+4;4*10+3=40+3=43;43*10+2=430+2=432;432*10+1=4320+1=4321;
               number =number/10;//123//12//1//0
            }return result;
            
}
}
