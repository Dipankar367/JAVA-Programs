package programS;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String... args) {

		 int num;
		 
		 System.out.println("Enter an Integer number:");

		    Scanner input = new Scanner(System.in);
		    num = input.nextInt();

		    if(num%2==0){
		    	System.out.println("even number");
		    //else if(num%2!=0)
		    }else
		    {
		    	System.out.println("odd number");
		    }
	}

}
