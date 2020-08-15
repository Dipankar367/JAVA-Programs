package programS;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		
		 int num = 123;
	     int sum = 0; 
	          
	        while (num > 0) 
	        { 
	            sum = sum + num % 10; //3+2+1
	            num = num/10; //12 1 0
	        } 
	       
	        System.out.println("sum of digits in num: "+sum); 

//***************************************************************************************
	        
	        
	        System.out.println("enter the digits you want to sum");
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        
	        int Sum = 0;
	        
	        while (number > 0) 
	        { 
	        	Sum = Sum + number % 10; 
	            number = number/10; 
	        } 
	       
	        System.out.println("Sum of digits you entered : "+Sum); 

	        
	        

	}

}
