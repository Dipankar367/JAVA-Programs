package programS;

public class Amstrong_Number {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int sum = 0;
		int m;
		
		while(num>0) {
			m = num%10;
			num = num/10;
			sum = sum + m*m*m;
		}
		
		if(temp==sum) {
			System.out.println("its an amstrong number");
		}else {
			System.out.println("its not an amstrong number");

		}
	}

}
