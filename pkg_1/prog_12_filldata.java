package pkg_1;

import java.util.Arrays;

public class prog_12_filldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,2,9,6,4};
		Arrays.fill(arr, 20); // same number 20 takes place at all the positions in the array
		for(int n : arr) {
			System.out.print(n + " ");
		}

	}

}
