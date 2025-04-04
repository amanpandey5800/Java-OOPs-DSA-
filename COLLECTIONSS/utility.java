comparator.java,package COLLECTIONSS;
import java.util.Arrays;
import java.util.*;
public class utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,7,2,17,5,9,0};
		List<Integer> nlist =  Arrays.asList(3,7,2,17,5,9,0); // list only
		System.out.println(nlist);
		
		Collections.sort(nlist);
		System.out.println(nlist);
		
		Collections.reverse(nlist);
		System.out.println(nlist);
		
	}

}
