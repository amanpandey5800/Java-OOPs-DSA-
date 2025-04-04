package Strings;
import java.util.*;
public class store_char_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("I work with mphasis ");
		
		List<Character> element=new ArrayList<Character>();
		
		for(int i=0;i<sb.length();i++) {
			element.add(sb.charAt(i));
		}
		System.out.println(element);
		
		// without brackets 
		for(char i : element) {
			System.out.print(i+" ");
		}
		
		
	}
	
	


}