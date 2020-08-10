 	package programS;
import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_In_Array {

	public static void main(String[] args) {

		//for string value
		String s = "INDIA";
		char[] ch = s.toCharArray();
		
		Set<Character> check = new HashSet<Character>();
		for(char name : ch){
			
			if(check.add(name)==false){
				System.out.println("Dublicate name is::"+name);
			}
		}
		
		//for integer value

		int num[] = {1,2,3,4,2,5,6,7};
		
		Set<Integer> no = new HashSet<Integer>();
		for(int number : num){
			
			if(no.add(number)==false){
				System.out.println("Dublicate number is::"+number);

			}
		}
		
		
		
		
	}

}
