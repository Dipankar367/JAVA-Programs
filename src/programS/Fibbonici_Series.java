package programS;

import java.util.Scanner;

public class Fibbonici_Series {
	
	public static void main(String[] args)
		{

			
			/*Program for Fibonacci series
			   
			     0, 1, 1, 2, 3, 5, 8, 13, 21,..........n
	------------------------------------------------------------------------------*/
			
		int count,  a=0, b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count ");
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.println(a+" ");
		
		int c = a + b;
		a = b;
		b= c;
        }
			
			
			/*int a=0 , b=1 , c;
			System.out.println(a);
			System.out.println(b);
			c=a+b;
			System.out.println(c);
			
			for(int i=2;i<10;i++)
			{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			}*/
			
			
			
			
	      
			
			/*int a = 0, b = 1, c=1,n;

	          System.out.println("Enter the limit");

	            Scanner sc = new Scanner(System.in);

	        n = sc.nextInt();

	         for(int i = 0; i<n; i++) {

	        	 a = b;

	             b = c;

	             c = a + b;

	           System.out.println(c);

	           
	    }
*/			 
			
	     	/**
	 		Write program to get result of 52+42-32+22-12 
	 		 */
	 		
	 		/*
	 			 int sum = 0;  
	 			  for (int i=5;i>=1;i--){      
	 			   if(i%2!=0){
	 			    if(sum<(i*i)){
	 			     sum = (i*i)-sum;
	 			    }else{
	 			     sum = sum-(i*i);
	 			    }    
	 			   }else{    
	 			    sum = sum+(i*i);
	 			   }    
	 			  }
	 			  System.out.println(sum);
	 			  */
	 			//  -------------------------------------------------------------------
	 			
		}
		}





