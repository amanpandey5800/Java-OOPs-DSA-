package pkg_1;

import java.util.Arrays;

public class prog_11_bS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,3,8,2,17};
		//for(int n:numbers) {
			//System.out.print(n + " ");
		//}
		Arrays.sort(numbers);
		
		for(int n:numbers) {
			System.out.print(n + " ");
		}
		int pos=Arrays.binarySearch(numbers,8);
		System.out.println("\n 8 is in the position" + pos);
	}

}
