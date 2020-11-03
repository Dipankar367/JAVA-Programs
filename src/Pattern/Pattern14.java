package pattern;

public class Pattern14 {

	/**

1 1 1 1 1 1 1 
1 1 1 1 1 2 2 
1 1 1 1 3 3 3 
1 1 1 4 4 4 4 
1 1 5 5 5 5 5 
1 6 6 6 6 6 6 
7 7 7 7 7 7 7 
	
	*/
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 7; i++) 
        {
            for (int j = 1; j <= 7-i; j++)
            {
                System.out.print(0+" ");
            }
             
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
        }
         

	}

}
