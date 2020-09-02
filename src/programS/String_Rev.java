package programS;

public class String_Rev {
	

	public static void main(String[] args) 
	{
		
		//using for loop
		
		String s="INTERVIEW";
		
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
		rev=rev+ s.charAt(i);
		}
		System.out.println(rev); 
		
		//using StringBuffer class
     
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
}
