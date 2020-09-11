package programS;

public class Largest_valueIn_Array {

	public static void main(String[] args) {

		
		int[] num={5,2,7,27,4,20,-44,9};
		 
		int largeNum = num[0];
		int smallNum = num[0];
 
		for(int i=0; i<num.length; i++)
		{
			if(num[i] > largeNum){
				largeNum =num[i];
			}
			else if(num[i]< smallNum){
				smallNum = num[i];
			}
			}
	
		System.out.println("largest value in the Given Array is "+ largeNum);
		System.out.println("smallest value in the Given Array is "+ smallNum);
		
		
		//second largenum
		
		int arr[]= {12,90,36,-32,76};
		int lnum = arr[0];
		int scndlnum = arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(lnum<arr[i]) {
				scndlnum = lnum;
				lnum = arr[i];
			}else if(scndlnum<arr[i])
			{
				scndlnum= arr[i];
			}
		}
		System.out.println("lnum: "+lnum);
		System.out.println("scndlnum: "+scndlnum);
		

	}
	
	}

	


