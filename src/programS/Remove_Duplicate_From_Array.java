package programS;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_From_Array {

	public static void main(String[] args) {

		
		int arr[] = {3,2,5,2,3,1,4,3};

		Set<Integer> st  = new HashSet<Integer>();
		for(int i = 0; i<arr.length; i++) {
			st.add(arr[i]);
		}
		for(int num : st) {
			System.out.println(num);
		}

	}

}
