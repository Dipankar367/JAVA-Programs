package programS;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		 String s1 = "nasha";  
	     String s2 = "hasan";
	     
	         char[] Arr1 = s1.toCharArray();  
	         char[] Arr2 = s2.toCharArray();  
	         
	         Arrays.sort(Arr1);  
	         Arrays.sort(Arr2);  
	         
	         boolean status;
	         status = Arrays.equals(Arr1, Arr2);  
	      
	     
	     if (status==true) {  
	         System.out.println(s1 + " and " + s2 + " are Anagrams");  
	     } else {  
	         System.out.println(s1 + " and " + s2 + " are Not anagrams");  
	     }  
		
	//========================================================

	     
		String str1 = "lisften";
		String str2 = "silhent";
		
		 
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
	 
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch2);
		
		
		if(Arrays.equals(ch1, ch2)) 
		{
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
		
		
	}

}
