package programS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String[] name = {"john","smith","tom","peter"};
		
		ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList(name));
	
		arrlist.add("lisa");
		arrlist.add("roy");
		
		System.out.println(arrlist);
		System.out.println(arrlist.get(3));
	
	
	}

}
