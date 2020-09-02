package programS;

import java.util.ArrayList;
import java.util.List;

public class Sort_Array_As_ODD_EVEN {

	public static void main(String[] args) {

		int arr[] = {1,0,7,4,2,5,6,3};
		
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		
		for(int i : arr) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		System.out.println("even:"+even);
				System.out.println("odd:"+odd);
		
	}

}
