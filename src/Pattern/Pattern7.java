package pattern;

public class Pattern7 {

	/**
 1234567
  234567
   34567
    4567
     567
      67
       7
	 
	 */
	public static void main(String[] args) 
	{
	
		 for (int i = 1; i <= 7; i++) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int k = i; k <= 7; k++) 
	            { 
	                System.out.print(k); 
	            } 
	             
	            System.out.println(); 
	        } 
	         
	}

}
