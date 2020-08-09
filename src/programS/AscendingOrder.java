package programS;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {

		int arr[] = {2,1,5,9,4,6,3,-1};
		
		Arrays.sort(arr);
		
		for(int  i=0; i<arr.length; i++) {
		
		System.out.println(arr[i]);
		}
	}

}
