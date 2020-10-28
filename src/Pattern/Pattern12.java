package pattern;

public class Pattern12 {
/**
 
1 2 3 4 5 6 7 
 2 3 4 5 6 7 
  3 4 5 6 7 
   4 5 6 7 
    5 6 7 
     6 7 
      7 
     6 7 
    5 6 7 
   4 5 6 7 
  3 4 5 6 7 
 2 3 4 5 6 7 
1 2 3 4 5 6 7 
	 
	 */
	
	public static void main(String[] args) 
	{
	
		 for (int i = 1; i <= 7; i++) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int k = i; k <= 7; k++) 
	            { 
	                System.out.print(k+" "); 
	            } 
	             
	            System.out.println(); 
	        } 
	         
	        //Printing lower half of the pattern 
	         
	        for (int i = 7-1; i >= 1; i--) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int k = i; k <= 7; k++)
	            {
	                System.out.print(k+" ");
	            }
	             
	            System.out.println();
	        }
	         
	}

}
