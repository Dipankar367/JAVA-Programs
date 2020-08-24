package programS;

public class Reverse_An_Integer {

	public static void main(String[] args) {

		int num= 110;
		int rev=0;
		
		while(num!=0){
			rev=  num % 10 + rev * 10 ;
            num = num/10;
		}
	
		System.out.println(rev);
		
		//=========================================
		
		int no = 110;
		int rev1;

		while(no!= 0) {
			rev1= no % 10;
			no = no/10;
			System.out.print(rev1);

		}

	}

}
