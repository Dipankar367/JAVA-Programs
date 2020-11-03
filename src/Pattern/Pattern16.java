package pattern;

public class Pattern16 {

	public static void main(String[] args) {

	  /*   5 * * * * 
             5 4 * * * 
             5 4 3 * * 
             5 4 3 2 * 
             5 4 3 2 1    */
		
		
		for (int i = 1; i <=5; i++) {
			
			int n = 5;
			
			for (int j = 1; j <=5; j++) {
				
				if(i>=j){
					System.out.print(n-- +" ");
				}else
				{
					System.out.print("*" +" ");
				}
				}
	        System.out.println();

                } 

	
	}

}
