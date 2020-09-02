package programS;

import java.util.Scanner;

public class Reverse_Sentence_String {

	public static void main(String[] args) {

		
		String s;
		System.out.println("enter the sentence");
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		String[] rev = s.split(" ");
		
		for(int i=rev.length-1;i>=0;i--){
		
			System.out.print(rev[i]+" ");
		}
		}

}
